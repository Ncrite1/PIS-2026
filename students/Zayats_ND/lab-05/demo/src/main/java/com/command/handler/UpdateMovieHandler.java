package com.command.handler;

import com.command.UpdateMovieCommand;
import com.port.out.MovieRepository;
import com.domain.model.Movie;
import com.domain.value_objects.MovieTitle;
import com.domain.value_objects.Genre;
import com.domain.value_objects.Rating;
import com.domain.value_objects.Description;

import org.springframework.stereotype.Service;

@Service
public class UpdateMovieHandler {

    private final MovieRepository movieRepository;

    public UpdateMovieHandler(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie handle(UpdateMovieCommand command) {

        Movie movie = movieRepository.findById(command.getMovieId())
                .orElseThrow(() -> new IllegalArgumentException("Movie not found"));

                
        MovieTitle title = new MovieTitle(command.getTitle());
        Genre genre = new Genre(command.getGenre());
        Rating rating = new Rating(command.getRating());
        Description description = new Description(command.getDescription());

        movie.update(title, genre, rating, description);

        return movieRepository.save(movie);
    }
}