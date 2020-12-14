package com.example.android_practice;

public class userExample {
    private int id;
    private int quota;
    private String type;
    private String status;
    private User user;
    private match match;

    public userExample(int id, int quota, String type, String status, User user, com.example.android_practice.match match) {
        this.id = id;
        this.quota = quota;
        this.type = type;
        this.status = status;
        this.user = user;
        this.match = match;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public com.example.android_practice.match getMatch() {
        return match;
    }

    public void setMatch(com.example.android_practice.match match) {
        this.match = match;
    }
}
