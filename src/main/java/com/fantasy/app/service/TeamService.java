package com.fantasy.app.service;

import com.fantasy.app.dto.Team;
import com.fantasy.app.dto.sportradar.teams.SportRadarTeam;
import com.fantasy.app.jooq.generated.tables.records.TeamsRecord;
import com.fantasy.app.repo.TeamRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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

    public Team getTeamById(UUID teamId) {
        Team team = null;
        try {
            team = teamRepo.getTeamById(teamId);
        } catch (Exception e) {
            LOGGER.info("Cannot find team with id: [{}]. Creating new one", teamId);
        }
        return team;
    }

    public boolean createTeam(SportRadarTeam team) {
        int recordsInserted = teamRepo.createTeam(convertFromSportRadarTeam(team));
        return recordsInserted == 1;
    }

    public boolean updateByTeam(Team team) {
        int recordsInserted = teamRepo.updateTeam(convertFromTeam(team));
        return recordsInserted == 1;
    }

    public boolean updateBySportRadarTeam(SportRadarTeam team) {
        int recordsInserted = teamRepo.updateTeam(convertFromSportRadarTeam(team));
        return recordsInserted == 1;
    }

    private TeamsRecord convertFromSportRadarTeam(SportRadarTeam sportRadarTeam) {
        return new TeamsRecord(UUID.fromString(sportRadarTeam.getId()),
            sportRadarTeam.getName(),
            null,
            null);
    }

    private TeamsRecord convertFromTeam(Team team) {
        return new TeamsRecord(team.getId(),
                team.getName(),
                team.getImageId(),
                team.getByeWeek());
    }
}
