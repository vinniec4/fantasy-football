package com.fantasy.app.service;

import com.fantasy.app.dto.Player;
import com.fantasy.app.dto.Team;
import com.fantasy.app.dto.sportradar.roster.RosterPlayer;
import com.fantasy.app.jooq.generated.tables.records.PlayersRecord;
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

    public Player getPlayerById(UUID playerId) {
        Player player = null;
        try {
            player = playerRepo.getPlayerById(playerId);
        } catch (Exception e) {
            LOGGER.info("Cannot find player with id: [{}]", playerId, e);
        }
        return player;
    }

    public boolean createPlayer(RosterPlayer rosterPlayer, Team team) {
        int recordsInserted = playerRepo.createPlayer(convertFromRosterPlayer(rosterPlayer, team));
        return recordsInserted == 1;
    }

    public boolean updatePlayer(RosterPlayer rosterPlayer, Team team) {
        int recordsInserted = playerRepo.updatePlayer(convertFromRosterPlayer(rosterPlayer, team));
        return recordsInserted == 1;
    }

    private PlayersRecord convertFromRosterPlayer(RosterPlayer rosterPlayer, Team team) {
        return new PlayersRecord(UUID.fromString(rosterPlayer.getId()),
                rosterPlayer.getName(),
                rosterPlayer.getPosition(),
                team.getId(),
                null,
                team.getByeWeek());
    }
}
