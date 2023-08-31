
package com.fantasy.app.dto.espn.team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProTeam {

    @JsonProperty("abbrev")
    private String abbrev;
    @JsonProperty("byeWeek")
    private int byeWeek;
    @JsonProperty("id")
    private int id;
    @JsonProperty("location")
    private String location;
    @JsonProperty("name")
    private String name;
    @JsonProperty("proGamesByScoringPeriod")
    private ProGamesByScoringPeriod proGamesByScoringPeriod;
    @JsonProperty("teamPlayersByPosition")
    private TeamPlayersByPosition teamPlayersByPosition;
    @JsonProperty("universeId")
    private int universeId;

    @JsonProperty("abbrev")
    public String getAbbrev() {
        return abbrev;
    }

    @JsonProperty("abbrev")
    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    @JsonProperty("byeWeek")
    public int getByeWeek() {
        return byeWeek;
    }

    @JsonProperty("byeWeek")
    public void setByeWeek(int byeWeek) {
        this.byeWeek = byeWeek;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("proGamesByScoringPeriod")
    public ProGamesByScoringPeriod getProGamesByScoringPeriod() {
        return proGamesByScoringPeriod;
    }

    @JsonProperty("proGamesByScoringPeriod")
    public void setProGamesByScoringPeriod(ProGamesByScoringPeriod proGamesByScoringPeriod) {
        this.proGamesByScoringPeriod = proGamesByScoringPeriod;
    }

    @JsonProperty("teamPlayersByPosition")
    public TeamPlayersByPosition getTeamPlayersByPosition() {
        return teamPlayersByPosition;
    }

    @JsonProperty("teamPlayersByPosition")
    public void setTeamPlayersByPosition(TeamPlayersByPosition teamPlayersByPosition) {
        this.teamPlayersByPosition = teamPlayersByPosition;
    }

    @JsonProperty("universeId")
    public int getUniverseId() {
        return universeId;
    }

    @JsonProperty("universeId")
    public void setUniverseId(int universeId) {
        this.universeId = universeId;
    }

}
