package com.domain.events;

public class MovieCreatedEvent {
    private final Long movieId;

    public MovieCreatedEvent(Long movieId) {
        this.movieId = movieId;
    }

    public Long getMovieId() {
        return movieId;
    }
}