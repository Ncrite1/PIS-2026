package com.events;

public class UserUpdatedEvent implements DomainEvent {

    private final Long userId;

    public UserUpdatedEvent(Long userId) {
        if (userId == null) {
            throw new IllegalArgumentException("userId cannot be null");
        }
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
}