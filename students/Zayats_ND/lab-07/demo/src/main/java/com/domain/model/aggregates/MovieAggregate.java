package com.domain.model.aggregates;

import com.domain.events.DomainEvent;
import com.domain.events.MovieCreatedEvent;
import com.domain.events.MovieUpdatedEvent;
import com.domain.exception.DomainException;
import com.domain.value_objects.*;

import java.util.ArrayList;
import java.util.List;

public class  MovieAggregate {

    private final Long id;
    private MovieTitle title;
    private Genre genre;
    private Rating rating;
    private Description description;

    private final List<Object> events = new ArrayList<>();

    public MovieAggregate(Long id,
                          MovieTitle title,
                          Genre genre,
                          Rating rating,
                          Description description) {

        if (id == null) throw new DomainException("Movie id required");

        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.description = description;

        events.add(new MovieCreatedEvent(id));
    }

    public void update(MovieTitle title, Genre genre, Rating rating, Description description) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.description = description;

        events.add(new MovieUpdatedEvent(id));
    }

    public Long getId() {
        return id;
    }
}