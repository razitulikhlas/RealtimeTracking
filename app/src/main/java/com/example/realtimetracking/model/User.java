package com.example.realtimetracking.model;

import java.util.HashMap;

public class User {
    private String uid,email;
    private HashMap<String,User> acceplist; //list user

    public User() {
    }

    public User(String uid, String email) {
        this.uid = uid;
        this.email = email;
        acceplist =new HashMap<>();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HashMap<String, User> getAcceplist() {
        return acceplist;
    }

    public void setAcceplist(HashMap<String, User> acceplist) {
        this.acceplist = acceplist;
    }
}
