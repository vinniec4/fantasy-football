package com.fantasy.app.service;

import com.fantasy.app.dto.Player;
import com.fantasy.app.repo.PlayerRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PlayerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerService.class);

    private final PlayerRepo playerRepo;

    @Autowired
    public PlayerService(PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }

    public List<Player> getPlayersByTeamId(UUID teamId) {
        List<Player> players;
        if(teamId == null) {
            players = playerRepo.getAllPlayers();
        } else {
            players = playerRepo.getPlayerByTeamId(teamId);
        }
        return players;
    }
}
