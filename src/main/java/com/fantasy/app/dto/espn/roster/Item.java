
package com.fantasy.app.dto.espn.roster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

    @JsonProperty("id")
    private String id;
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("guid")
    private String guid;
    @JsonProperty("alternateIds")
    private AlternateIds alternateIds;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("weight")
    private double weight;
    @JsonProperty("displayWeight")
    private String displayWeight;
    @JsonProperty("height")
    private double height;
    @JsonProperty("displayHeight")
    private String displayHeight;
    @JsonProperty("age")
    private int age;
    @JsonProperty("dateOfBirth")
    private String dateOfBirth;
    @JsonProperty("debutYear")
    private int debutYear;
    @JsonProperty("links")
    private List<Link> links;
    @JsonProperty("birthPlace")
    private BirthPlace birthPlace;
    @JsonProperty("college")
    private College college;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("headshot")
    private Headshot headshot;
    @JsonProperty("jersey")
    private String jersey;
    @JsonProperty("position")
    private Position position;
    @JsonProperty("injuries")
    private List<Object> injuries;
    @JsonProperty("teams")
    private List<Team> teams;
    @JsonProperty("contracts")
    private List<Object> contracts;
    @JsonProperty("experience")
    private Experience experience;
    @JsonProperty("status")
    private Status status;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("guid")
    public String getGuid() {
        return guid;
    }

    @JsonProperty("guid")
    public void setGuid(String guid) {
        this.guid = guid;
    }

    @JsonProperty("alternateIds")
    public AlternateIds getAlternateIds() {
        return alternateIds;
    }

    @JsonProperty("alternateIds")
    public void setAlternateIds(AlternateIds alternateIds) {
        this.alternateIds = alternateIds;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("weight")
    public double getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @JsonProperty("displayWeight")
    public String getDisplayWeight() {
        return displayWeight;
    }

    @JsonProperty("displayWeight")
    public void setDisplayWeight(String displayWeight) {
        this.displayWeight = displayWeight;
    }

    @JsonProperty("height")
    public double getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(double height) {
        this.height = height;
    }

    @JsonProperty("displayHeight")
    public String getDisplayHeight() {
        return displayHeight;
    }

    @JsonProperty("displayHeight")
    public void setDisplayHeight(String displayHeight) {
        this.displayHeight = displayHeight;
    }

    @JsonProperty("age")
    public int getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(int age) {
        this.age = age;
    }

    @JsonProperty("dateOfBirth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("debutYear")
    public int getDebutYear() {
        return debutYear;
    }

    @JsonProperty("debutYear")
    public void setDebutYear(int debutYear) {
        this.debutYear = debutYear;
    }

    @JsonProperty("links")
    public List<Link> getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    @JsonProperty("birthPlace")
    public BirthPlace getBirthPlace() {
        return birthPlace;
    }

    @JsonProperty("birthPlace")
    public void setBirthPlace(BirthPlace birthPlace) {
        this.birthPlace = birthPlace;
    }

    @JsonProperty("college")
    public College getCollege() {
        return college;
    }

    @JsonProperty("college")
    public void setCollege(College college) {
        this.college = college;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("headshot")
    public Headshot getHeadshot() {
        return headshot;
    }

    @JsonProperty("headshot")
    public void setHeadshot(Headshot headshot) {
        this.headshot = headshot;
    }

    @JsonProperty("jersey")
    public String getJersey() {
        return jersey;
    }

    @JsonProperty("jersey")
    public void setJersey(String jersey) {
        this.jersey = jersey;
    }

    @JsonProperty("position")
    public Position getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Position position) {
        this.position = position;
    }

    @JsonProperty("injuries")
    public List<Object> getInjuries() {
        return injuries;
    }

    @JsonProperty("injuries")
    public void setInjuries(List<Object> injuries) {
        this.injuries = injuries;
    }

    @JsonProperty("teams")
    public List<Team> getTeams() {
        return teams;
    }

    @JsonProperty("teams")
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    @JsonProperty("contracts")
    public List<Object> getContracts() {
        return contracts;
    }

    @JsonProperty("contracts")
    public void setContracts(List<Object> contracts) {
        this.contracts = contracts;
    }

    @JsonProperty("experience")
    public Experience getExperience() {
        return experience;
    }

    @JsonProperty("experience")
    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

}
