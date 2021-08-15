
package com.fantasy.app.dto.sportradar.teams;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamColor {

    @JsonProperty("type")
    private String type;
    @JsonProperty("hex_color")
    private String hexColor;
    @JsonProperty("alpha")
    private double alpha;
    @JsonProperty("rgb_color")
    private RgbColor rgbColor;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("hex_color")
    public String getHexColor() {
        return hexColor;
    }

    @JsonProperty("hex_color")
    public void setHexColor(String hexColor) {
        this.hexColor = hexColor;
    }

    @JsonProperty("alpha")
    public double getAlpha() {
        return alpha;
    }

    @JsonProperty("alpha")
    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    @JsonProperty("rgb_color")
    public RgbColor getRgbColor() {
        return rgbColor;
    }

    @JsonProperty("rgb_color")
    public void setRgbColor(RgbColor rgbColor) {
        this.rgbColor = rgbColor;
    }

}
