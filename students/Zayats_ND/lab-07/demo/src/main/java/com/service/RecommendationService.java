package com.service;

import com.query.GetUserRecommendationsQuery;
import com.query.handler.GetUserRecommendationsHandler;
import com.domain.model.Movie;

import java.util.List;

public class RecommendationService {

    private final GetUserRecommendationsHandler handler;

    public RecommendationService(GetUserRecommendationsHandler handler) {
        this.handler = handler;
    }

    public List<Movie> getRecommendations(Long userId) {
        return handler.handle(new GetUserRecommendationsQuery(userId));
    }
}