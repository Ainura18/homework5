package com.realestate.proxy;

public class Agent {
    private String name;
    private boolean isLoggedIn;

    public Agent(String name, boolean isLoggedIn) {
        this.name = name;
        this.isLoggedIn = isLoggedIn;
    }

    public boolean canUploadImage() {
        return isLoggedIn;
    }
}
