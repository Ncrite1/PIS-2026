package com.domain.events;

public class MovieUpdatedEvent implements DomainEvent {

    private final Long movieId;

    public MovieUpdatedEvent(Long movieId) {
        if (movieId == null) {
            throw new IllegalArgumentException("movieId cannot be null");
        }
        this.movieId = movieId;
    }

    public Long getMovieId() {
        return movieId;
    }
}