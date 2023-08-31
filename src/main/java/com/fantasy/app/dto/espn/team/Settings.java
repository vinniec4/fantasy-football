
package com.fantasy.app.dto.espn.team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Settings {

    @JsonProperty("defaultDraftPosition")
    private int defaultDraftPosition;
    @JsonProperty("draftLobbyMinimumLeagueCount")
    private int draftLobbyMinimumLeagueCount;
    @JsonProperty("gameNotificationSettings")
    private GameNotificationSettings gameNotificationSettings;
    @JsonProperty("gated")
    private boolean gated;
    @JsonProperty("playerOwnershipSettings")
    private PlayerOwnershipSettings playerOwnershipSettings;
    @JsonProperty("proTeams")
    private List<ProTeam> proTeams;

    @JsonProperty("defaultDraftPosition")
    public int getDefaultDraftPosition() {
        return defaultDraftPosition;
    }

    @JsonProperty("defaultDraftPosition")
    public void setDefaultDraftPosition(int defaultDraftPosition) {
        this.defaultDraftPosition = defaultDraftPosition;
    }

    @JsonProperty("draftLobbyMinimumLeagueCount")
    public int getDraftLobbyMinimumLeagueCount() {
        return draftLobbyMinimumLeagueCount;
    }

    @JsonProperty("draftLobbyMinimumLeagueCount")
    public void setDraftLobbyMinimumLeagueCount(int draftLobbyMinimumLeagueCount) {
        this.draftLobbyMinimumLeagueCount = draftLobbyMinimumLeagueCount;
    }

    @JsonProperty("gameNotificationSettings")
    public GameNotificationSettings getGameNotificationSettings() {
        return gameNotificationSettings;
    }

    @JsonProperty("gameNotificationSettings")
    public void setGameNotificationSettings(GameNotificationSettings gameNotificationSettings) {
        this.gameNotificationSettings = gameNotificationSettings;
    }

    @JsonProperty("gated")
    public boolean isGated() {
        return gated;
    }

    @JsonProperty("gated")
    public void setGated(boolean gated) {
        this.gated = gated;
    }

    @JsonProperty("playerOwnershipSettings")
    public PlayerOwnershipSettings getPlayerOwnershipSettings() {
        return playerOwnershipSettings;
    }

    @JsonProperty("playerOwnershipSettings")
    public void setPlayerOwnershipSettings(PlayerOwnershipSettings playerOwnershipSettings) {
        this.playerOwnershipSettings = playerOwnershipSettings;
    }

    @JsonProperty("proTeams")
    public List<ProTeam> getProTeams() {
        return proTeams;
    }

    @JsonProperty("proTeams")
    public void setProTeams(List<ProTeam> proTeams) {
        this.proTeams = proTeams;
    }

}
