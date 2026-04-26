package com.model;

import com.events.RecommendationGeneratedEvent;

import java.util.ArrayList;
import java.util.List;

public class Recommendation {

    private final Long id;
    private final Long userId;
    private final Long movieId;
    private final String text;

    private final List<Object> events = new ArrayList<>();

    public Recommendation(Long id, Long userId, Long movieId, String text) {
        if (id == null || userId == null || movieId == null)
            throw new IllegalArgumentException();

        this.id = id;
        this.userId = userId;
        this.movieId = movieId;
        this.text = text;

        events.add(new RecommendationGeneratedEvent(userId, movieId));
    }

    public List<Object> getEvents() {
        return events;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getMovieId() {
        return movieId;
    }
    
    public String getText() {
        return text;
    }
}