
package com.fantasy.app.dto.sportradar.schedule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Week {

    @JsonProperty("id")
    private String id;
    @JsonProperty("sequence")
    private int sequence;
    @JsonProperty("title")
    private String title;
    @JsonProperty("games")
    private List<Game> games = null;
    @JsonProperty("bye_week")
    private List<ByeWeek> byeWeek = null;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("sequence")
    public int getSequence() {
        return sequence;
    }

    @JsonProperty("sequence")
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("games")
    public List<Game> getGames() {
        return games;
    }

    @JsonProperty("games")
    public void setGames(List<Game> games) {
        this.games = games;
    }

    @JsonProperty("bye_week")
    public List<ByeWeek> getByeWeek() {
        return byeWeek;
    }

    @JsonProperty("bye_week")
    public void setByeWeek(List<ByeWeek> byeWeek) {
        this.byeWeek = byeWeek;
    }

}
