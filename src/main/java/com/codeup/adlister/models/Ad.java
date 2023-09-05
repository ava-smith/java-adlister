package com.codeup.adlister.models;

public class Ad {
    private long id;
    private long usersId;
    private String title;
    private String description;

    public Ad(long id, long usersId, String title, String description) {
        this.id = id;
        this.usersId = usersId;
        this.title = title;
        this.description = description;
    }

    public Ad(long usersId, String title, String description) {
        this.usersId = usersId;
        this.title = title;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return usersId;
    }

    public void setUserId(long usersId) {
        this.usersId = usersId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
