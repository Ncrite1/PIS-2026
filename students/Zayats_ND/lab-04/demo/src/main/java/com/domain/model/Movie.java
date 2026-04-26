package com.domain.model;

import com.domain.value_objects.*;
import com.domain.events.MovieCreatedEvent;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private Long id;
    private MovieTitle title;
    private Genre genre;
    private Rating rating;
    private Description description;

    private final List<Object> events = new ArrayList<>();

    public Movie(Long id, MovieTitle title, Genre genre, Rating rating, Description description) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.description = description;

        events.add(new MovieCreatedEvent(id));
    }

    public Long getId() { return id; }
    public MovieTitle getTitle() { return title; }
    public Genre getGenre() { return genre; }
    public Rating getRating() { return rating; }
    public Description getDescription() { return description; }

    public List<Object> getEvents() { return events; }

    public void update(MovieTitle title, Genre genre, Rating rating, Description description) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.description = description;
    }
}