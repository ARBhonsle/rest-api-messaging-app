package com.bridgelabz.restapimessagingapp.entity;

public class UserDetails {
    private String fname, lname;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String details() {
        return "Hello " + getFname() + " " + getLname() + " from BridgeLabz!";
    }
}
