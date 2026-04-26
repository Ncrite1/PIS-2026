package com.query;

public final class GetMovieQuery {

    private final Long movieId;

    public GetMovieQuery(Long movieId) {
        if (movieId == null || movieId <= 0) {
            throw new IllegalArgumentException("movieId must be positive");
        }
        this.movieId = movieId;
    }

    public Long getMovieId() {
        return movieId;
    }
}