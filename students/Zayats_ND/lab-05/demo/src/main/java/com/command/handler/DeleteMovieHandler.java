package com.command.handler;

import com.command.DeleteMovieCommand;
import com.port.out.MovieRepository;
import com.domain.model.Movie;
import org.springframework.stereotype.Service;

@Service
public class DeleteMovieHandler {

    private final MovieRepository movieRepository;

    public DeleteMovieHandler(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void handle(DeleteMovieCommand command) {

        Movie movie = movieRepository.findById(command.getMovieId())
                .orElseThrow(() -> new IllegalArgumentException("Movie not found"));

        movieRepository.delete(movie);
    }
}