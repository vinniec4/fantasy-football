
package com.fantasy.app.dto.sportradar.roster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RosterPlayer {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("jersey")
    private String jersey;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("abbr_name")
    private String abbrName;
    @JsonProperty("preferred_name")
    private String preferredName;
    @JsonProperty("birth_date")
    private String birthDate;
    @JsonProperty("weight")
    private double weight;
    @JsonProperty("height")
    private int height;
    @JsonProperty("position")
    private String position;
    @JsonProperty("birth_place")
    private String birthPlace;
    @JsonProperty("high_school")
    private String highSchool;
    @JsonProperty("college")
    private String college;
    @JsonProperty("college_conf")
    private String collegeConf;
    @JsonProperty("rookie_year")
    private int rookieYear;
    @JsonProperty("status")
    private String status;
    @JsonProperty("sr_id")
    private String srId;
    @JsonProperty("draft")
    private Draft draft;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("jersey")
    public String getJersey() {
        return jersey;
    }

    @JsonProperty("jersey")
    public void setJersey(String jersey) {
        this.jersey = jersey;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("abbr_name")
    public String getAbbrName() {
        return abbrName;
    }

    @JsonProperty("abbr_name")
    public void setAbbrName(String abbrName) {
        this.abbrName = abbrName;
    }

    @JsonProperty("preferred_name")
    public String getPreferredName() {
        return preferredName;
    }

    @JsonProperty("preferred_name")
    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    @JsonProperty("birth_date")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birth_date")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("weight")
    public double getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @JsonProperty("height")
    public int getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(int height) {
        this.height = height;
    }

    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    @JsonProperty("birth_place")
    public String getBirthPlace() {
        return birthPlace;
    }

    @JsonProperty("birth_place")
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    @JsonProperty("high_school")
    public String getHighSchool() {
        return highSchool;
    }

    @JsonProperty("high_school")
    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    @JsonProperty("college")
    public String getCollege() {
        return college;
    }

    @JsonProperty("college")
    public void setCollege(String college) {
        this.college = college;
    }

    @JsonProperty("college_conf")
    public String getCollegeConf() {
        return collegeConf;
    }

    @JsonProperty("college_conf")
    public void setCollegeConf(String collegeConf) {
        this.collegeConf = collegeConf;
    }

    @JsonProperty("rookie_year")
    public int getRookieYear() {
        return rookieYear;
    }

    @JsonProperty("rookie_year")
    public void setRookieYear(int rookieYear) {
        this.rookieYear = rookieYear;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("sr_id")
    public String getSrId() {
        return srId;
    }

    @JsonProperty("sr_id")
    public void setSrId(String srId) {
        this.srId = srId;
    }

    @JsonProperty("draft")
    public Draft getDraft() {
        return draft;
    }

    @JsonProperty("draft")
    public void setDraft(Draft draft) {
        this.draft = draft;
    }

}
