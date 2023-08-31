package com.fantasy.app.service;

import com.fantasy.app.dto.Team;
import com.fantasy.app.dto.espn.team.ProTeam;
import com.fantasy.app.jooq.generated.tables.records.TeamsRecord;
import com.fantasy.app.repo.TeamRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TeamService.class);

    private final TeamRepo teamRepo;

    @Autowired
    public TeamService(final TeamRepo teamRepo) {
        this.teamRepo = teamRepo;
    }

    public List<Team> getTeams() {
        return teamRepo.getTeams();
    }

    public Team getTeamById(String teamId) {
        Team team = null;
        try {
            team = teamRepo.getTeamById(teamId);
        } catch (Exception e) {
            LOGGER.info("Cannot find team with id: [{}]. Creating new one", teamId);
        }
        return team;
    }

    public boolean createTeam(ProTeam team) {
        int recordsInserted = teamRepo.createTeam(convertFromEspnTeam(team));
        return recordsInserted == 1;
    }

    public boolean updateByTeam(Team team) {
        int recordsInserted = teamRepo.updateTeam(convertFromTeam(team));
        return recordsInserted == 1;
    }

    public boolean updateByEspnTeam(ProTeam team) {
        int recordsInserted = teamRepo.updateTeam(convertFromEspnTeam(team));
        return recordsInserted == 1;
    }

    private TeamsRecord convertFromEspnTeam(ProTeam proTeam) {
        return new TeamsRecord(String.valueOf(proTeam.getId()),
            proTeam.getName(),
            null,
                proTeam.getByeWeek());
    }

    private TeamsRecord convertFromTeam(Team team) {
        return new TeamsRecord(team.getId(),
                team.getName(),
                team.getImageUrl(),
                team.getByeWeek());
    }
}
