
package com.fantasy.app.dto.espn.roster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Experience {

    @JsonProperty("years")
    private int years;

    @JsonProperty("years")
    public int getYears() {
        return years;
    }

    @JsonProperty("years")
    public void setYears(int years) {
        this.years = years;
    }

}
