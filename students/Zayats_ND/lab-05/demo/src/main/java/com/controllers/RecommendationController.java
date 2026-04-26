package com.controllers;

import com.domain.model.Movie;
import com.query.GetUserRecommendationsQuery;
import com.query.handler.GetUserRecommendationsHandler;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recommendations")
public class RecommendationController {

    private final GetUserRecommendationsHandler handler;

    public RecommendationController(GetUserRecommendationsHandler handler) {
        this.handler = handler;
    }

    @GetMapping("/{userId}")
    public List<Movie> getRecommendations(@PathVariable Long userId) {
        return handler.handle(new GetUserRecommendationsQuery(userId));
    }
}