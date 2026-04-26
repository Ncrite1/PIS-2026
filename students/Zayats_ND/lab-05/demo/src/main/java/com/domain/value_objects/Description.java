package com.domain.value_objects;

public record Description(String value) {
    public Description {
        if (value == null || value.isBlank())
            throw new IllegalArgumentException("Description cannot be empty");
    }
}