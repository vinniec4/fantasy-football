package com.fantasy.app.controller;

import com.fantasy.app.dto.Player;
import com.fantasy.app.service.PlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PlayerController extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerController.class);

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("players")
    public ResponseEntity<List<Player>> getPlayers(@RequestParam(name = "teamId") String teamId) {
        return ResponseEntity.ok(playerService.getPlayersByTeamId(teamId));
    }

}
