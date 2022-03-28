package com.example.demo.model;

public enum Permission {
    DEVELOPER("DEVELOPER"),
    VIEWER("VIEWER");

    private final String permission;

    Permission(String permission){
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
