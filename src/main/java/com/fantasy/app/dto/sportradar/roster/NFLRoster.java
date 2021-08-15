
package com.fantasy.app.dto.sportradar.roster;

import com.fantasy.app.dto.sportradar.Venue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NFLRoster {

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
    @JsonProperty("franchise")
    private Franchise franchise;
    @JsonProperty("venue")
    private Venue venue;
    @JsonProperty("division")
    private Division division;
    @JsonProperty("conference")
    private Conference conference;
    @JsonProperty("references")
    private List<Object> references = null;
    @JsonProperty("coaches")
    private List<Coach> coaches = null;
    @JsonProperty("players")
    private List<RosterPlayer> players = null;
    @JsonProperty("_comment")
    private String comment;

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

    @JsonProperty("franchise")
    public Franchise getFranchise() {
        return franchise;
    }

    @JsonProperty("franchise")
    public void setFranchise(Franchise franchise) {
        this.franchise = franchise;
    }

    @JsonProperty("venue")
    public Venue getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @JsonProperty("division")
    public Division getDivision() {
        return division;
    }

    @JsonProperty("division")
    public void setDivision(Division division) {
        this.division = division;
    }

    @JsonProperty("conference")
    public Conference getConference() {
        return conference;
    }

    @JsonProperty("conference")
    public void setConference(Conference conference) {
        this.conference = conference;
    }

    @JsonProperty("references")
    public List<Object> getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(List<Object> references) {
        this.references = references;
    }

    @JsonProperty("coaches")
    public List<Coach> getCoaches() {
        return coaches;
    }

    @JsonProperty("coaches")
    public void setCoaches(List<Coach> coaches) {
        this.coaches = coaches;
    }

    @JsonProperty("players")
    public List<RosterPlayer> getPlayers() {
        return players;
    }

    @JsonProperty("players")
    public void setPlayers(List<RosterPlayer> players) {
        this.players = players;
    }

    @JsonProperty("_comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("_comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

}
