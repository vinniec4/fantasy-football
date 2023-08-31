package com.fantasy.app.controller;

import com.fantasy.app.dto.Team;
import com.fantasy.app.service.TeamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class TeamController extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerController.class);

    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("teams")
    public ResponseEntity<List<Team>> getTeams() {
        return ResponseEntity.ok(teamService.getTeams());
    }

    @GetMapping("teams/{teamId}")
    public ResponseEntity<Team> getTeamsById(@PathVariable String teamId) {
        return ResponseEntity.ok(teamService.getTeamById(teamId));
    }

}
