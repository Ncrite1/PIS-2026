package com.domain.value_objects;

public record MovieTitle(String value) {
    public MovieTitle {
        if (value == null || value.isBlank())
            throw new IllegalArgumentException("Title cannot be empty");
    }
}