package com.example.movies.application.service;

import com.example.movies.application.port.in.SearchMoviesUseCase;
import com.example.movies.application.port.in.GetMovieDetailsUseCase;

public class MovieService implements SearchMoviesUseCase, GetMovieDetailsUseCase {
    @Override
    public Object search(Object command) {
        return null;
    }

    @Override
    public Object getById(Long movieId) {
        return null;
    }
}