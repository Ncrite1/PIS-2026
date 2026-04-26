package com.service;

import com.query.GetMovieQuery;
import com.query.handler.GetMovieHandler;
import com.domain.model.Movie;

public class MovieService {

    private final GetMovieHandler getMovieHandler;

    public MovieService(GetMovieHandler getMovieHandler) {
        this.getMovieHandler = getMovieHandler;
    }

    public Movie getMovie(Long movieId) {
        return getMovieHandler.handle(new GetMovieQuery(movieId));
    }
}