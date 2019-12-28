package com.zl.starter.export.user;

public class UserClient {
    private UserProperties userProperties;
    public UserClient() {

    }

    public UserClient(UserProperties p) {
        this.userProperties = p;
    }

    public String getName() {
        return userProperties.getName();
    }
}
