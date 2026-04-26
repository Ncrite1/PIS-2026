package com.model;

import com.events.MovieCreatedEvent;
import com.value_objects.*;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private final Long id;
    private final MovieTitle title;
    private final Genre genre;
    private final Rating rating;
    private final Description description;

    private final List<Object> events = new ArrayList<>();

    public Movie(Long id, MovieTitle title, Genre genre, Rating rating, Description description) {
        if (id == null) throw new IllegalArgumentException("ID required");

        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.description = description;

        events.add(new MovieCreatedEvent(id));
    }

    public MovieTitle getTitle() {
        return title;
    }

    public List<Object> getEvents() {
        return events;
    }

    public Genre getGenre() {
        return genre;
    }

    public Rating getRating() {
        return rating;
    }

    public Long getId() {
        return id;
    }

    public Description getDescription() {
        return description;
    }
}