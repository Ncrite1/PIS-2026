package com.example.movies.application.port.in;

import com.example.movies.domain.model.Movie;

public interface GetMovieDetailsUseCase {
    Movie getById(Long movieId);
}