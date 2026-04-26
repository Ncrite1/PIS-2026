package com.domain.value_objects;

import java.time.LocalDateTime;

public record WatchlistEntryDate(LocalDateTime value) {
    public WatchlistEntryDate {
        if (value == null)
            throw new IllegalArgumentException("Date cannot be null");
    }
}