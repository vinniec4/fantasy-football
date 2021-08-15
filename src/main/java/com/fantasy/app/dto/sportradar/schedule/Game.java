
package com.fantasy.app.dto.sportradar.schedule;

import com.fantasy.app.dto.sportradar.Venue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Game {

    @JsonProperty("id")
    private String id;
    @JsonProperty("status")
    private String status;
    @JsonProperty("scheduled")
    private String scheduled;
    @JsonProperty("entry_mode")
    private String entryMode;
    @JsonProperty("sr_id")
    private String srId;
    @JsonProperty("venue")
    private Venue venue;
    @JsonProperty("home")
    private Home home;
    @JsonProperty("away")
    private Away away;
    @JsonProperty("broadcast")
    private Broadcast broadcast;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("scheduled")
    public String getScheduled() {
        return scheduled;
    }

    @JsonProperty("scheduled")
    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }

    @JsonProperty("entry_mode")
    public String getEntryMode() {
        return entryMode;
    }

    @JsonProperty("entry_mode")
    public void setEntryMode(String entryMode) {
        this.entryMode = entryMode;
    }

    @JsonProperty("sr_id")
    public String getSrId() {
        return srId;
    }

    @JsonProperty("sr_id")
    public void setSrId(String srId) {
        this.srId = srId;
    }

    @JsonProperty("venue")
    public Venue getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @JsonProperty("home")
    public Home getHome() {
        return home;
    }

    @JsonProperty("home")
    public void setHome(Home home) {
        this.home = home;
    }

    @JsonProperty("away")
    public Away getAway() {
        return away;
    }

    @JsonProperty("away")
    public void setAway(Away away) {
        this.away = away;
    }

    @JsonProperty("broadcast")
    public Broadcast getBroadcast() {
        return broadcast;
    }

    @JsonProperty("broadcast")
    public void setBroadcast(Broadcast broadcast) {
        this.broadcast = broadcast;
    }

}
