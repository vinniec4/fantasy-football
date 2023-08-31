
package com.fantasy.app.dto.espn.roster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AlternateIds {

    @JsonProperty("sdr")
    private String sdr;

    @JsonProperty("sdr")
    public String getSdr() {
        return sdr;
    }

    @JsonProperty("sdr")
    public void setSdr(String sdr) {
        this.sdr = sdr;
    }

}
