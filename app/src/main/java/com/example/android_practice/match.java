package com.example.android_practice;

public class match {
    private int id;
    private String type;
    private String description;
    private String startAt;
    private String endAt;
    private int fee;
    private String phone;
    private String quota;
    private String status;
    private location location;

    public match(int id, String type, String description, String startAt, String endAt, int fee, String phone, String quota, String status, com.example.android_practice.location location) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.startAt = startAt;
        this.endAt = endAt;
        this.fee = fee;
        this.phone = phone;
        this.quota = quota;
        this.status = status;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public com.example.android_practice.location getLocation() {
        return location;
    }

    public void setLocation(com.example.android_practice.location location) {
        this.location = location;
    }
}
