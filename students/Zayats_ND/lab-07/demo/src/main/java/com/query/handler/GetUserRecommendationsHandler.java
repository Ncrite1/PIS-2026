package com.query.handler;

import java.util.List;
import java.util.stream.Collectors;
import com.port.out.MovieRepository;
import com.domain.model.Movie;
import com.query.*;


public class GetUserRecommendationsHandler {

    private final MovieRepository movieRepository;

    public GetUserRecommendationsHandler(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> handle(GetUserRecommendationsQuery query) {

        // простая заглушка логики рекомендаций:
        // берём все фильмы и возвращаем их как "рекомендации"

        return movieRepository.findAll()
                .stream()
                .collect(Collectors.toList());
    }
}