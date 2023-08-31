
package com.fantasy.app.dto.espn.team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Schedule {

    @JsonProperty("display")
    private boolean display;
    @JsonProperty("settings")
    private Settings settings;

    @JsonProperty("display")
    public boolean isDisplay() {
        return display;
    }

    @JsonProperty("display")
    public void setDisplay(boolean display) {
        this.display = display;
    }

    @JsonProperty("settings")
    public Settings getSettings() {
        return settings;
    }

    @JsonProperty("settings")
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

}
