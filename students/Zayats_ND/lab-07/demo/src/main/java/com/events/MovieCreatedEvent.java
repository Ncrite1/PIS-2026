package com.events;

public class MovieCreatedEvent implements DomainEvent{

    private final Long movieId;

    public MovieCreatedEvent(Long movieId) {
        if (movieId == null) {
            throw new IllegalArgumentException("movieId cannot be null");
        }
        this.movieId = movieId;
    }

    public Long getMovieId() {
        return movieId;
    }
}