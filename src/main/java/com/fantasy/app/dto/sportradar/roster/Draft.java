
package com.fantasy.app.dto.sportradar.roster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Draft {

    @JsonProperty("year")
    private int year;
    @JsonProperty("round")
    private int round;
    @JsonProperty("number")
    private int number;
    @JsonProperty("team")
    private RosterTeam team;

    @JsonProperty("year")
    public int getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(int year) {
        this.year = year;
    }

    @JsonProperty("round")
    public int getRound() {
        return round;
    }

    @JsonProperty("round")
    public void setRound(int round) {
        this.round = round;
    }

    @JsonProperty("number")
    public int getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(int number) {
        this.number = number;
    }

    @JsonProperty("team")
    public RosterTeam getTeam() {
        return team;
    }

    @JsonProperty("team")
    public void setTeam(RosterTeam team) {
        this.team = team;
    }

}
