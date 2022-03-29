package com.example.demo.model;

public enum Permission {
    WEBSITE_VIEW("website:view"),
    WEBSITE_CHANGE("website:change");

    private final String permission;

    Permission(String permission){
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
