package com.model;

import com.events.UserRegisteredEvent;
import com.value_objects.*;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final Long id;
    private final Email email;
    private final UserName name;

    private final List<Object> events = new ArrayList<>();

    public User(Long id, Email email, UserName name) {
        if (id == null) throw new IllegalArgumentException("ID required");

        this.id = id;
        this.email = email;
        this.name = name;

        events.add(new UserRegisteredEvent(id));
    }

    public List<Object> getEvents() {
        return events;
    }

    public Long getId() {
        return id;
    }

    public Email getemail() {
        return email;
    }

    public UserName getname() {
        return name;
    }
}