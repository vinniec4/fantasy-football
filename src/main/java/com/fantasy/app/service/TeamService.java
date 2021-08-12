package com.fantasy.app.service;

import com.fantasy.app.dto.Team;
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
        return teamRepo.getTeamById(teamId);
    }
}
