package com.value_objects;

public record UserName(String value) {
    public UserName {
        if (value == null || value.isBlank())
            throw new IllegalArgumentException("Name cannot be empty");
    }
}