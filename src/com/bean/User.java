package com.bean;

import java.util.HashSet;
import java.util.Set;

public class User {
    private Long id;
    private String title;
    private Set<Role> role = new HashSet<>();

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
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
