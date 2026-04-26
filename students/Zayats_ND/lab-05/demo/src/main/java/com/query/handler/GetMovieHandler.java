package com.query.handler;

import com.port.out.MovieRepository;
import com.domain.model.Movie;
import com.query.GetMovieQuery;

import org.springframework.stereotype.Service;

@Service
public class GetMovieHandler {

    private final MovieRepository movieRepository;

    public GetMovieHandler(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie handle(GetMovieQuery query) {

        return movieRepository.findById(query.getMovieId())
            .orElse(null);  // Возвращаем null вместо ошибки
    }
}