package com.domain.model.aggregates;

import com.domain.events.*;
import com.domain.exception.DomainException;
import com.domain.value_objects.WatchlistEntryDate;

import java.util.*;

public class WatchlistAggregate {

    private final Long id;
    private final Long userId;

    private final Map<Long, WatchlistEntryDate> movies = new HashMap<>();
    private final List<DomainEvent> events = new ArrayList<>();

    public WatchlistAggregate(Long id, Long userId) {

        if (id == null || userId == null)
            throw new DomainException("Watchlist id/userId required");

        this.id = id;
        this.userId = userId;
    }

    public void addMovie(Long movieId, WatchlistEntryDate date) {

        if (movies.containsKey(movieId))
            throw new DomainException("Movie already in watchlist");

        movies.put(movieId, date);

        events.add(new WatchlistItemAddedEvent(userId, movieId));
    }

    public void removeMovie(Long movieId) {

        if (!movies.containsKey(movieId))
            throw new DomainException("Movie not found");

        movies.remove(movieId);

        events.add(new WatchlistItemRemovedEvent(userId, movieId));
    }

    public Long getId() {
        return id;
    }

    public List<DomainEvent> getEvents() {
        return events;
    }
}