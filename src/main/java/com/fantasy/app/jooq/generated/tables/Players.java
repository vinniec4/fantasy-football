/*
 * This file is generated by jOOQ.
 */
package com.fantasy.app.jooq.generated.tables;


import com.fantasy.app.jooq.generated.FantasyFootball;
import com.fantasy.app.jooq.generated.Indexes;
import com.fantasy.app.jooq.generated.Keys;
import com.fantasy.app.jooq.generated.tables.records.PlayersRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Players extends TableImpl<PlayersRecord> {

    private static final long serialVersionUID = -1173131205;

    /**
     * The reference instance of <code>fantasy_football.players</code>
     */
    public static final Players PLAYERS = new Players();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlayersRecord> getRecordType() {
        return PlayersRecord.class;
    }

    /**
     * The column <code>fantasy_football.players.id</code>.
     */
    public final TableField<PlayersRecord, UUID> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>fantasy_football.players.name</code>.
     */
    public final TableField<PlayersRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>fantasy_football.players.position</code>.
     */
    public final TableField<PlayersRecord, String> POSITION = createField(DSL.name("position"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>fantasy_football.players.team_id</code>.
     */
    public final TableField<PlayersRecord, UUID> TEAM_ID = createField(DSL.name("team_id"), org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * The column <code>fantasy_football.players.image_id</code>.
     */
    public final TableField<PlayersRecord, String> IMAGE_ID = createField(DSL.name("image_id"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>fantasy_football.players.bye_week</code>.
     */
    public final TableField<PlayersRecord, Integer> BYE_WEEK = createField(DSL.name("bye_week"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>fantasy_football.players</code> table reference
     */
    public Players() {
        this(DSL.name("players"), null);
    }

    /**
     * Create an aliased <code>fantasy_football.players</code> table reference
     */
    public Players(String alias) {
        this(DSL.name(alias), PLAYERS);
    }

    /**
     * Create an aliased <code>fantasy_football.players</code> table reference
     */
    public Players(Name alias) {
        this(alias, PLAYERS);
    }

    private Players(Name alias, Table<PlayersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Players(Name alias, Table<PlayersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Players(Table<O> child, ForeignKey<O, PlayersRecord> key) {
        super(child, key, PLAYERS);
    }

    @Override
    public Schema getSchema() {
        return FantasyFootball.FANTASY_FOOTBALL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PLAYERS_ID_UINDEX, Indexes.PLAYERS_NAME_INDEX, Indexes.PLAYERS_TEAM_INDEX);
    }

    @Override
    public UniqueKey<PlayersRecord> getPrimaryKey() {
        return Keys.PLAYERS_PK;
    }

    @Override
    public List<UniqueKey<PlayersRecord>> getKeys() {
        return Arrays.<UniqueKey<PlayersRecord>>asList(Keys.PLAYERS_PK);
    }

    @Override
    public List<ForeignKey<PlayersRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PlayersRecord, ?>>asList(Keys.PLAYERS__PLAYERS_TEAMS_ID_FK);
    }

    public Teams teams() {
        return new Teams(this, Keys.PLAYERS__PLAYERS_TEAMS_ID_FK);
    }

    @Override
    public Players as(String alias) {
        return new Players(DSL.name(alias), this);
    }

    @Override
    public Players as(Name alias) {
        return new Players(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Players rename(String name) {
        return new Players(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Players rename(Name name) {
        return new Players(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, String, String, UUID, String, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
