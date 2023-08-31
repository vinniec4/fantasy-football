
package com.fantasy.app.dto.espn.team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamPlayersByPosition {

    @JsonProperty("14")
    private int _14;
    @JsonProperty("15")
    private int _15;
    @JsonProperty("16")
    private int _16;

    @JsonProperty("14")
    public int get14() {
        return _14;
    }

    @JsonProperty("14")
    public void set14(int _14) {
        this._14 = _14;
    }

    @JsonProperty("15")
    public int get15() {
        return _15;
    }

    @JsonProperty("15")
    public void set15(int _15) {
        this._15 = _15;
    }

    @JsonProperty("16")
    public int get16() {
        return _16;
    }

    @JsonProperty("16")
    public void set16(int _16) {
        this._16 = _16;
    }

}
