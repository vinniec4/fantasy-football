
package com.fantasy.app.dto.espn.roster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class College {

    @JsonProperty("id")
    private String id;
    @JsonProperty("mascot")
    private String mascot;
    @JsonProperty("name")
    private String name;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("abbrev")
    private String abbrev;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("mascot")
    public String getMascot() {
        return mascot;
    }

    @JsonProperty("mascot")
    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("abbrev")
    public String getAbbrev() {
        return abbrev;
    }

    @JsonProperty("abbrev")
    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

}
