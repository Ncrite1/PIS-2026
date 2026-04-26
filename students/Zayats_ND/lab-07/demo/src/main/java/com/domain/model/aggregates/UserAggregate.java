package com.domain.model.aggregates;

import com.domain.events.DomainEvent;
import com.domain.events.UserRegisteredEvent;
import com.domain.events.UserUpdatedEvent;
import com.domain.exception.DomainException;
import com.domain.value_objects.Email;
import com.domain.value_objects.UserName;

import java.util.ArrayList;
import java.util.List;

public class UserAggregate {

    private final Long id;
    private Email email;
    private UserName name;

    private final List<DomainEvent> events = new ArrayList<>();

    public UserAggregate(Long id, Email email, UserName name) {

        if (id == null) throw new DomainException("User id required");

        this.id = id;
        this.email = email;
        this.name = name;

        events.add(new UserRegisteredEvent(id));
    }

    public void update(Email email, UserName name) {
        this.email = email;
        this.name = name;

        events.add(new UserUpdatedEvent(id));
    }

    public Long getId() {
        return id;
    }

    public Email getEmail() {
        return email;
    }

    public UserName getname() {
        return name;
    }

    public List<DomainEvent> getEvents() {
        return events;
    }
}