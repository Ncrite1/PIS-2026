package com.value_objects;

public record Genre(String value) {

    public Genre {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Genre cannot be empty");
        }

        value = value.toUpperCase();
    }

    public String value() {
        return value;
    }
}