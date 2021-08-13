
package com.fantasy.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RgbColor {

    @JsonProperty("red")
    private int red;
    @JsonProperty("green")
    private int green;
    @JsonProperty("blue")
    private int blue;

    @JsonProperty("red")
    public int getRed() {
        return red;
    }

    @JsonProperty("red")
    public void setRed(int red) {
        this.red = red;
    }

    @JsonProperty("green")
    public int getGreen() {
        return green;
    }

    @JsonProperty("green")
    public void setGreen(int green) {
        this.green = green;
    }

    @JsonProperty("blue")
    public int getBlue() {
        return blue;
    }

    @JsonProperty("blue")
    public void setBlue(int blue) {
        this.blue = blue;
    }

}
