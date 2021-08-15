
package com.fantasy.app.dto.sportradar.teams;

import com.fantasy.app.dto.sportradar.Venue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SportRadarTeam {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("market")
    private String market;
    @JsonProperty("alias")
    private String alias;
    @JsonProperty("sr_id")
    private String srId;
    @JsonProperty("references")
    private List<Object> references = null;
    @JsonProperty("venue")
    private Venue venue;
    @JsonProperty("franchise")
    private Franchise franchise;
    @JsonProperty("team_colors")
    private List<TeamColor> teamColors = null;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("market")
    public String getMarket() {
        return market;
    }

    @JsonProperty("market")
    public void setMarket(String market) {
        this.market = market;
    }

    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @JsonProperty("sr_id")
    public String getSrId() {
        return srId;
    }

    @JsonProperty("sr_id")
    public void setSrId(String srId) {
        this.srId = srId;
    }

    @JsonProperty("references")
    public List<Object> getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(List<Object> references) {
        this.references = references;
    }

    @JsonProperty("venue")
    public Venue getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @JsonProperty("franchise")
    public Franchise getFranchise() {
        return franchise;
    }

    @JsonProperty("franchise")
    public void setFranchise(Franchise franchise) {
        this.franchise = franchise;
    }

    @JsonProperty("team_colors")
    public List<TeamColor> getTeamColors() {
        return teamColors;
    }

    @JsonProperty("team_colors")
    public void setTeamColors(List<TeamColor> teamColors) {
        this.teamColors = teamColors;
    }

}
