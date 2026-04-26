package com.query.handler;

import com.port.out.MovieRepository;
import com.domain.model.Movie;
import com.query.*;

public class GetMovieHandler {

    private final MovieRepository movieRepository;

    public GetMovieHandler(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie handle(GetMovieQuery query) {
        Movie movie = movieRepository.findById(query.getMovieId());

        if (movie == null) {
            throw new IllegalArgumentException("Movie not found");
        }

        return movie;
    }
}

