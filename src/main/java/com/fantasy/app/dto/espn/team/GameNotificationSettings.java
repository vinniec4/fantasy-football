
package com.fantasy.app.dto.espn.team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameNotificationSettings {

    @JsonProperty("availabilityNotificationsEnabled")
    private boolean availabilityNotificationsEnabled;
    @JsonProperty("draftNotificationsEnabled")
    private boolean draftNotificationsEnabled;
    @JsonProperty("injuryNotificationsEnabled")
    private boolean injuryNotificationsEnabled;
    @JsonProperty("lineupNotificationsEnabled")
    private boolean lineupNotificationsEnabled;
    @JsonProperty("positionEligibilityNotificationsEnabled")
    private boolean positionEligibilityNotificationsEnabled;
    @JsonProperty("rosterNewsNotificationsEnabled")
    private boolean rosterNewsNotificationsEnabled;
    @JsonProperty("startBenchNotificationsEnabled")
    private boolean startBenchNotificationsEnabled;
    @JsonProperty("tradeNotificationsEnabled")
    private boolean tradeNotificationsEnabled;

    @JsonProperty("availabilityNotificationsEnabled")
    public boolean isAvailabilityNotificationsEnabled() {
        return availabilityNotificationsEnabled;
    }

    @JsonProperty("availabilityNotificationsEnabled")
    public void setAvailabilityNotificationsEnabled(boolean availabilityNotificationsEnabled) {
        this.availabilityNotificationsEnabled = availabilityNotificationsEnabled;
    }

    @JsonProperty("draftNotificationsEnabled")
    public boolean isDraftNotificationsEnabled() {
        return draftNotificationsEnabled;
    }

    @JsonProperty("draftNotificationsEnabled")
    public void setDraftNotificationsEnabled(boolean draftNotificationsEnabled) {
        this.draftNotificationsEnabled = draftNotificationsEnabled;
    }

    @JsonProperty("injuryNotificationsEnabled")
    public boolean isInjuryNotificationsEnabled() {
        return injuryNotificationsEnabled;
    }

    @JsonProperty("injuryNotificationsEnabled")
    public void setInjuryNotificationsEnabled(boolean injuryNotificationsEnabled) {
        this.injuryNotificationsEnabled = injuryNotificationsEnabled;
    }

    @JsonProperty("lineupNotificationsEnabled")
    public boolean isLineupNotificationsEnabled() {
        return lineupNotificationsEnabled;
    }

    @JsonProperty("lineupNotificationsEnabled")
    public void setLineupNotificationsEnabled(boolean lineupNotificationsEnabled) {
        this.lineupNotificationsEnabled = lineupNotificationsEnabled;
    }

    @JsonProperty("positionEligibilityNotificationsEnabled")
    public boolean isPositionEligibilityNotificationsEnabled() {
        return positionEligibilityNotificationsEnabled;
    }

    @JsonProperty("positionEligibilityNotificationsEnabled")
    public void setPositionEligibilityNotificationsEnabled(boolean positionEligibilityNotificationsEnabled) {
        this.positionEligibilityNotificationsEnabled = positionEligibilityNotificationsEnabled;
    }

    @JsonProperty("rosterNewsNotificationsEnabled")
    public boolean isRosterNewsNotificationsEnabled() {
        return rosterNewsNotificationsEnabled;
    }

    @JsonProperty("rosterNewsNotificationsEnabled")
    public void setRosterNewsNotificationsEnabled(boolean rosterNewsNotificationsEnabled) {
        this.rosterNewsNotificationsEnabled = rosterNewsNotificationsEnabled;
    }

    @JsonProperty("startBenchNotificationsEnabled")
    public boolean isStartBenchNotificationsEnabled() {
        return startBenchNotificationsEnabled;
    }

    @JsonProperty("startBenchNotificationsEnabled")
    public void setStartBenchNotificationsEnabled(boolean startBenchNotificationsEnabled) {
        this.startBenchNotificationsEnabled = startBenchNotificationsEnabled;
    }

    @JsonProperty("tradeNotificationsEnabled")
    public boolean isTradeNotificationsEnabled() {
        return tradeNotificationsEnabled;
    }

    @JsonProperty("tradeNotificationsEnabled")
    public void setTradeNotificationsEnabled(boolean tradeNotificationsEnabled) {
        this.tradeNotificationsEnabled = tradeNotificationsEnabled;
    }

}
