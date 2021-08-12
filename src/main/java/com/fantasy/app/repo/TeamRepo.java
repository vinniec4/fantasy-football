package com.fantasy.app.repo;

import com.fantasy.app.dto.Team;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

import static com.fantasy.app.jooq.generated.tables.Teams.TEAMS;

@Repository
public class TeamRepo {
    private static final Logger LOGGER = LoggerFactory.getLogger(TeamRepo.class);

    private final DSLContext context;

    @Autowired
    public TeamRepo(DSLContext context) {
        this.context = context;
    }

    public List<Team> getTeams() {
        return context.selectFrom(TEAMS).fetchInto(Team.class);
    }

    public Team getTeamById(UUID teamId) {
        return context.selectFrom(TEAMS)
                .where(TEAMS.ID.eq(teamId))
                .fetchSingleInto(Team.class);
    }

}
