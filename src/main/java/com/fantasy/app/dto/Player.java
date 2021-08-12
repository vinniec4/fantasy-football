package com.fantasy.app.dto;

import java.util.UUID;

public class Player {
    private UUID id;
    private String name;
    private String position;
    private UUID teamId;
    private UUID image_id;
    private int byeWeek;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public UUID getTeamId() {
        return teamId;
    }

    public void setTeamId(UUID teamId) {
        this.teamId = teamId;
    }

    public UUID getImage_id() {
        return image_id;
    }

    public void setImage_id(UUID image_id) {
        this.image_id = image_id;
    }

    public int getByeWeek() {
        return byeWeek;
    }

    public void setByeWeek(int byeWeek) {
        this.byeWeek = byeWeek;
    }
}
