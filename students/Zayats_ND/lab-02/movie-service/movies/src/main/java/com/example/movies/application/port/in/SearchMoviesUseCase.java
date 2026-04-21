package com.example.movies.application.port.in;

import java.util.List;
import com.example.movies.domain.model.Movie;

public interface SearchMoviesUseCase {
    List<Movie> search(SearchMoviesCommand command);
}   