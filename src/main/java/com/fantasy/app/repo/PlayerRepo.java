package com.fantasy.app.repo;

import com.fantasy.app.dto.Player;
import com.fantasy.app.jooq.generated.tables.records.PlayersRecord;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

import static com.fantasy.app.jooq.generated.Tables.PLAYERS;

@Repository
public class PlayerRepo {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerRepo.class);

    private final DSLContext context;

    @Autowired
    public PlayerRepo(DSLContext context) {
        this.context = context;
    }

    public List<Player> getPlayerByTeamId(UUID teamId) {
        return context.selectFrom(PLAYERS)
                .where(PLAYERS.TEAM_ID.eq(teamId))
                .fetchInto(Player.class);
    }

    public Player getPlayerById(UUID playerId) {
        return context.selectFrom(PLAYERS)
                .where(PLAYERS.ID.eq(playerId))
                .fetchSingleInto(Player.class);
    }

    public int createPlayer(PlayersRecord record) {
        return context.executeInsert(record);
    }

    public int updatePlayer(PlayersRecord record) {
        return context.executeUpdate(record);
    }

    public List<Player> getAllPlayers() {
        return context.selectFrom(PLAYERS).fetchInto(Player.class);
    }
}
