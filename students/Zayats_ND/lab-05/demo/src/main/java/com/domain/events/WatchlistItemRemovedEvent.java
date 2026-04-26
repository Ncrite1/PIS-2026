package com.domain.events;

public class WatchlistItemRemovedEvent implements DomainEvent{

    private final Long userId;
    private final Long movieId;

    public WatchlistItemRemovedEvent(Long userId, Long movieId) {
        if (userId == null || movieId == null) {
            throw new IllegalArgumentException("IDs cannot be null");
        }
        this.userId = userId;
        this.movieId = movieId;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getMovieId() {
        return movieId;
    }
}