package com.fantasy.app.service;

import com.fantasy.app.dto.Player;
import com.fantasy.app.dto.Team;
import com.fantasy.app.dto.espn.roster.Item;
import com.fantasy.app.jooq.generated.tables.records.PlayersRecord;
import com.fantasy.app.repo.PlayerRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerService.class);

    private final PlayerRepo playerRepo;

    @Autowired
    public PlayerService(PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }

    public List<Player> getPlayersByTeamId(String teamId) {
        List<Player> players;
        if(teamId == null) {
            players = playerRepo.getAllPlayers();
        } else {
            players = playerRepo.getPlayerByTeamId(teamId);
        }
        return players;
    }

    public Player getPlayerById(String playerId) {
        Player player = null;
        try {
            player = playerRepo.getPlayerById(playerId);
        } catch (Exception e) {
            LOGGER.info("Cannot find player with id: [{}]. Creating new one", playerId);
        }
        return player;
    }

    public boolean createPlayer(Item rosterPlayer, Team team) {
        int recordsInserted = playerRepo.createPlayer(convertFromRosterPlayer(rosterPlayer, team));
        return recordsInserted == 1;
    }

    public boolean updatePlayer(Item rosterPlayer, Team team) {
        int recordsInserted = playerRepo.updatePlayer(convertFromRosterPlayer(rosterPlayer, team));
        return recordsInserted == 1;
    }

    private PlayersRecord convertFromRosterPlayer(Item item, Team team) {
        return new PlayersRecord(item.getId(),
                item.getDisplayName(),
                item.getPosition().getAbbreviation(),
                team.getId(),
                item.getHeadshot() != null ? item.getHeadshot().getHref() : "",
                team.getByeWeek());
    }
}
