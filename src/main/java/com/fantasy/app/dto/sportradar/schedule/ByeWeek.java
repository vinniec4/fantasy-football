
package com.fantasy.app.dto.sportradar.schedule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ByeWeek {

    @JsonProperty("team")
    private ScheduleTeam team;

    @JsonProperty("team")
    public ScheduleTeam getTeam() {
        return team;
    }

    @JsonProperty("team")
    public void setTeam(ScheduleTeam team) {
        this.team = team;
    }

}
