package com.value_objects;

public record Rating(double value) {
    public Rating {
        if (value < 0 || value > 10)
            throw new IllegalArgumentException("Rating must be 0-10");
    }
}