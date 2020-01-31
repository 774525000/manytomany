package com.bean;

import java.util.HashSet;
import java.util.Set;

public class Role {
    private Long id;
    private String title;
    private Set<User> user = new HashSet<>();

    public Set<User> getUser() {
        return user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
