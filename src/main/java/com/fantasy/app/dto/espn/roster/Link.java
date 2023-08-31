
package com.fantasy.app.dto.espn.roster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Link {

    @JsonProperty("language")
    private String language;
    @JsonProperty("rel")
    private List<String> rel;
    @JsonProperty("href")
    private String href;
    @JsonProperty("text")
    private String text;
    @JsonProperty("shortText")
    private String shortText;
    @JsonProperty("isExternal")
    private boolean isExternal;
    @JsonProperty("isPremium")
    private boolean isPremium;

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("rel")
    public List<String> getRel() {
        return rel;
    }

    @JsonProperty("rel")
    public void setRel(List<String> rel) {
        this.rel = rel;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("shortText")
    public String getShortText() {
        return shortText;
    }

    @JsonProperty("shortText")
    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    @JsonProperty("isExternal")
    public boolean isIsExternal() {
        return isExternal;
    }

    @JsonProperty("isExternal")
    public void setIsExternal(boolean isExternal) {
        this.isExternal = isExternal;
    }

    @JsonProperty("isPremium")
    public boolean isIsPremium() {
        return isPremium;
    }

    @JsonProperty("isPremium")
    public void setIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }

}
