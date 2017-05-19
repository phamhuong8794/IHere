package com.example.soi.ihere.model;

/**
 * Created by soi on 5/18/2017.
 */

public class User {
    private String userName, userId, userPassword;
    private String userIp;

    public User() {
    }

    public User(String userName, String userId, String userPassword, String userIp) {
        this.userName = userName;
        this.userId = userId;
        this.userPassword = userPassword;
        this.userIp = userIp;
    }

    public User(String userName, String userId, String userPassword) {
        this.userName = userName;
        this.userId = userId;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }
}
