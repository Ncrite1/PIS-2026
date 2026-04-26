package com.model;

import com.events.*;
import com.value_objects.WatchlistEntryDate;

import java.util.*;

public class Watchlist {

    private final Long id;
    private final Long userId;

    private final Map<Long, WatchlistEntryDate> movies = new HashMap<>();
    private final List<Object> events = new ArrayList<>();

    public Watchlist(Long id, Long userId) {
        if (id == null || userId == null)
            throw new IllegalArgumentException("IDs required");

        this.id = id;
        this.userId = userId;
    }

    public void addMovie(Long movieId, WatchlistEntryDate date) {
        if (movies.containsKey(movieId))
            throw new IllegalStateException("Already added");

        movies.put(movieId, date);
        events.add(new WatchlistItemAddedEvent(userId, movieId));
    }

    public void removeMovie(Long movieId) {
        if (!movies.containsKey(movieId))
            throw new IllegalStateException("Not found");

        movies.remove(movieId);
        events.add(new WatchlistItemRemovedEvent(userId, movieId));
    }

    public List<Object> getEvents() {
        return events;
    }

    public Long getId() {
        return id;
    }
}   