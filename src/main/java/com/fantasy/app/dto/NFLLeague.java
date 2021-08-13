
package com.fantasy.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NFLLeague {

    @JsonProperty("league")
    private League league;
    @JsonProperty("conferences")
    private List<Conference> conferences = null;
    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("league")
    public League getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(League league) {
        this.league = league;
    }

    @JsonProperty("conferences")
    public List<Conference> getConferences() {
        return conferences;
    }

    @JsonProperty("conferences")
    public void setConferences(List<Conference> conferences) {
        this.conferences = conferences;
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
