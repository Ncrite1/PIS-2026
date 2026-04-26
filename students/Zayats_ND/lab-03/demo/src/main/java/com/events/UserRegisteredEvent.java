package com.events;

public class UserRegisteredEvent implements DomainEvent {

    private final Long userId;

    public UserRegisteredEvent(Long userId) {
        if (userId == null) {
            throw new IllegalArgumentException("userId cannot be null");
        }
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
}