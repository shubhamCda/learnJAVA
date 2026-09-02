package com.demo.first.app;

public class User {
    private int Id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        Id = id;
        this.name = name;
        this.email = email;
    }

    // Default constructor
    public User() {
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
