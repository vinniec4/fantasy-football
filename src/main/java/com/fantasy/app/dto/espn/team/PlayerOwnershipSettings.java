
package com.fantasy.app.dto.espn.team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerOwnershipSettings {

    @JsonProperty("firstGameDate")
    private long firstGameDate;
    @JsonProperty("lastGameDate")
    private long lastGameDate;
    @JsonProperty("startDate")
    private long startDate;

    @JsonProperty("firstGameDate")
    public long getFirstGameDate() {
        return firstGameDate;
    }

    @JsonProperty("firstGameDate")
    public void setFirstGameDate(long firstGameDate) {
        this.firstGameDate = firstGameDate;
    }

    @JsonProperty("lastGameDate")
    public long getLastGameDate() {
        return lastGameDate;
    }

    @JsonProperty("lastGameDate")
    public void setLastGameDate(long lastGameDate) {
        this.lastGameDate = lastGameDate;
    }

    @JsonProperty("startDate")
    public long getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

}
