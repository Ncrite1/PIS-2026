package com.example.movies.domain.model;

import java.util.List;

public class Watchlist {
    private final Long userId;
    private final List<Movie> movies;

    public Watchlist(Long userId, List<Movie> movies) {
        this.userId = userId;
        this.movies = movies;
    }

    public Long getUserId() { return userId; }
    public List<Movie> getMovies() { return movies; }
}