
package com.fantasy.app.dto.espn.roster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamRoster {

    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("status")
    private String status;
    @JsonProperty("season")
    private Season season;
    @JsonProperty("coach")
    private List<Coach> coach;
    @JsonProperty("athletes")
    private List<Athlete> athletes;
    @JsonProperty("team")
    private Team__1 team;

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("season")
    public Season getSeason() {
        return season;
    }

    @JsonProperty("season")
    public void setSeason(Season season) {
        this.season = season;
    }

    @JsonProperty("coach")
    public List<Coach> getCoach() {
        return coach;
    }

    @JsonProperty("coach")
    public void setCoach(List<Coach> coach) {
        this.coach = coach;
    }

    @JsonProperty("athletes")
    public List<Athlete> getAthletes() {
        return athletes;
    }

    @JsonProperty("athletes")
    public void setAthletes(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    @JsonProperty("team")
    public Team__1 getTeam() {
        return team;
    }

    @JsonProperty("team")
    public void setTeam(Team__1 team) {
        this.team = team;
    }

}
