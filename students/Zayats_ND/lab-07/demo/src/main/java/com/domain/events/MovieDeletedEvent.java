package com.domain.events;

public class MovieDeletedEvent implements DomainEvent {

    private final Long movieId;

    public MovieDeletedEvent(Long movieId) {
        if (movieId == null) {
            throw new IllegalArgumentException("movieId cannot be null");
        }
        this.movieId = movieId;
    }

    public Long getMovieId() {
        return movieId;
    }
}