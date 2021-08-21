package com.fantasy.app.service;

import com.fantasy.app.Positions;
import com.fantasy.app.dto.Player;
import com.fantasy.app.dto.Team;
import com.fantasy.app.dto.sportradar.roster.NFLRoster;
import com.fantasy.app.dto.sportradar.schedule.NFLSchedule;
import com.fantasy.app.dto.sportradar.teams.NFLLeague;
import com.fantasy.app.http.RestHttpClient;
import org.apache.commons.lang3.EnumUtils;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class SportRadarService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SportRadarService.class);

    private final TeamService teamService;
    private final PlayerService playerService;
    private final Environment env;

    @Autowired
    public SportRadarService(final TeamService teamService,
                             final PlayerService playerService,
                             final Environment env) {
        this.teamService = teamService;
        this.playerService = playerService;
        this.env = env;
    }

    public void populateDatabase() {
        LOGGER.info("Populating Database from SportRadar");
        parseTeams();
        parseSchedule();
        parseRoster();
    }

    private void parseTeams() {
        String url = buildUrl("sportradar.teams.api");
        NFLLeague league = null;
        try {
            league = RestHttpClient.get(url, NFLLeague.class, new ArrayList<>(), Collections.singletonList(getApiHeader()));
        } catch (IOException | URISyntaxException e) {
            LOGGER.warn("NFL Teams Hierarchy call failed", e);
        }
        if (league != null) {
            league.getConferences().forEach(conference ->
                    conference.getDivisions().forEach(division ->
                            division.getTeams().forEach(sportRadarTeam -> {
                                UUID teamId = UUID.fromString(sportRadarTeam.getId());
                                Team teamRecord = teamService.getTeamById(teamId);
                                if (teamRecord == null) {
                                    teamService.createTeam(sportRadarTeam);
                                } else {
                                    teamService.updateBySportRadarTeam(sportRadarTeam);
                                }
            })));
        }
    }

    private void parseSchedule() {
        String url = buildUrl("sportradar.schedule.api");
        NFLSchedule schedule = null;
        try {
            schedule = RestHttpClient.get(url, NFLSchedule.class, new ArrayList<>(), Collections.singletonList(getApiHeader()));
        } catch (IOException | URISyntaxException e) {
            LOGGER.warn("NFL Schedule call failed", e);
        }
        if(schedule != null) {
            schedule.getWeeks()
                    .stream()
                    .filter(week -> !CollectionUtils.isEmpty(week.getByeWeek()))
                    .forEach(week -> week.getByeWeek()
                            .forEach(byeWeek -> {
                                Team team = teamService.getTeamById(UUID.fromString(byeWeek.getTeam().getId()));
                                team.setByeWeek(week.getSequence());
                                teamService.updateByTeam(team);
                            }));
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
            String url = buildUrl("sportradar.roster.api").replace(":team_id", team.getId().toString());
            NFLRoster nflRoster = null;
            try {
                nflRoster = RestHttpClient.get(url, NFLRoster.class, new ArrayList<>(), Collections.singletonList(getApiHeader()));
            } catch (IOException | URISyntaxException e) {
                LOGGER.warn("NFL Roster call failed", e);
            }
            if(nflRoster != null) {
                nflRoster.getPlayers()
                        .stream()
                        .filter(rosterPlayer -> EnumUtils.isValidEnum(Positions.class, rosterPlayer.getPosition()))
                        .forEach(sportRadarPlayer -> {
                            UUID playerId = UUID.fromString(sportRadarPlayer.getId());
                            Player playerRecord = playerService.getPlayerById(playerId);
                            if (playerRecord == null) {
                                playerService.createPlayer(sportRadarPlayer, team);
                            } else {
                                playerService.updatePlayer(sportRadarPlayer, team);
                            }
                });
            }
        });
    }

    private String buildUrl(String apiEndpoint) {
        return env.getProperty("sportradar.baseurl") + env.getProperty(apiEndpoint);
    }

    private Header getApiHeader() {
        return new BasicHeader("api_key", env.getProperty("sportradar.apiKey"));
    }
}
