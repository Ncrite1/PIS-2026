package com.domain.value_objects;

public record Email(String value) {
    public Email {
        if (value == null || !value.contains("@"))
            throw new IllegalArgumentException("Invalid email");
    }
}