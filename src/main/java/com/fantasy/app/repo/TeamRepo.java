package com.fantasy.app.repo;

import com.fantasy.app.dto.Team;
import com.fantasy.app.jooq.generated.tables.records.TeamsRecord;
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

    public int createTeam(Team team) {
        return context.insertInto(TEAMS, TEAMS.ID, TEAMS.NAME, TEAMS.BYE_WEEK, TEAMS.IMAGE_ID)
                .values(team.getId(), team.getName(), team.getByeWeek(), team.getImageId())
                .execute();
    }

    public int updateTeam(UUID id, Team teamRecord) {
        return context.update(TEAMS)
                .set(TEAMS.ID, teamRecord.getId())
                .set(TEAMS.NAME, teamRecord.getName())
                .set(TEAMS.BYE_WEEK, teamRecord.getByeWeek())
                .set(TEAMS.IMAGE_ID, teamRecord.getImageId())
                .where(TEAMS.ID.eq(id))
                .execute();
    }

    public int updateTeam(TeamsRecord record) {
        return context.executeUpdate(record);
    }

    public int createTeam(TeamsRecord record) {
        return context.executeInsert(record);
    }
}
