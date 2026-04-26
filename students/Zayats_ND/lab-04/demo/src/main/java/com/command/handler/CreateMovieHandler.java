package com.command.handler;

import com.command.CreateMovieCommand;
import com.port.out.MovieRepository;
import com.domain.model.Movie;
import com.domain.value_objects.MovieTitle;
import com.domain.value_objects.*;
import com.domain.value_objects.Rating;
import com.domain.value_objects.Description;

public class CreateMovieHandler {

    private final MovieRepository movieRepository;

    public CreateMovieHandler(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie handle(CreateMovieCommand command) {

        MovieTitle title = new MovieTitle(command.getTitle());
        Genre genre = new Genre(command.getGenre());
        Rating rating = new Rating(command.getRating());
        Description description = new Description(command.getDescription());

        Movie movie = new Movie(
                1L,
                title,
                genre,
                rating,
                description
        );

        return movieRepository.save(movie);
    }
}