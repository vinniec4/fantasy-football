package com.fantasy.app.service;

import com.fantasy.app.Positions;
import com.fantasy.app.dto.Player;
import com.fantasy.app.dto.Team;
import com.fantasy.app.dto.espn.roster.TeamRoster;
import com.fantasy.app.dto.espn.team.Schedule;
import com.fantasy.app.http.RestHttpClient;
import org.apache.commons.lang3.EnumUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class ESPNService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ESPNService.class);

    private final TeamService teamService;
    private final PlayerService playerService;
    private final Environment env;

    @Autowired
    public ESPNService(final TeamService teamService,
                       final PlayerService playerService,
                       final Environment env) {
        this.teamService = teamService;
        this.playerService = playerService;
        this.env = env;
    }

    public void populateDatabase() {
        LOGGER.info("Populating Database from ESPN");
        parseTeams();
        parseRoster();
    }

    private void parseTeams() {
        String url = env.getProperty("espn.schedule.api");
        Schedule schedule = null;
        try {
            schedule = RestHttpClient.get(url, Schedule.class, new ArrayList<>(), new ArrayList<>());
        } catch (IOException | URISyntaxException e) {
            LOGGER.warn("NFL Teams Hierarchy call failed", e);
        }
        if (schedule != null) {
            schedule.getSettings()
                    .getProTeams()
                    .stream()
                    .filter(proTeam -> proTeam.getByeWeek() > 0)
                    .forEach(proTeam -> {
                        Team teamRecord = teamService.getTeamById(String.valueOf(proTeam.getId()));
                        if (teamRecord == null) {
                            teamService.createTeam(proTeam);
                        } else {
                            teamService.updateByEspnTeam(proTeam);
                        }
                    });
        }
    }

    private void parseRoster() {
        List<Team> teams = teamService.getTeams();
        teams.forEach(team -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                LOGGER.info("sleeping");
            }
            String url = env.getProperty("espn.roster.api").replace(":team_id", team.getId().toString());
            TeamRoster teamRoster = null;
            try {
                teamRoster = RestHttpClient.get(url, TeamRoster.class, new ArrayList<>(), new ArrayList<>());
            } catch (IOException | URISyntaxException e) {
                LOGGER.warn("ESPN Roster call failed", e);
            }
            if(teamRoster != null) {
                teamRoster.getAthletes()
                        .forEach(athlete -> athlete.getItems()
                        .stream()
                        .filter(player -> EnumUtils.isValidEnum(Positions.class, player.getPosition().getAbbreviation()))
                        .forEach(espnPlayer -> {
                            Player playerRecord = playerService.getPlayerById(espnPlayer.getId());
                            if (playerRecord == null) {
                                playerService.createPlayer(espnPlayer, team);
                            } else {
                                playerService.updatePlayer(espnPlayer, team);
                            }
                }));
                team.setImageUrl(teamRoster.getTeam().getLogo());
                teamService.updateByTeam(team);
            }
        });
    }
}
