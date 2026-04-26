package com.example;

import com.command.CreateMovieCommand;
import com.command.DeleteMovieCommand;
import com.command.handler.CreateMovieHandler;
import com.command.handler.DeleteMovieHandler;
import com.domain.model.Movie;
import com.port.out.InMemoryMovieRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeleteMovieHandlerTest {

    @Test
    void shouldDeleteMovie() {

        InMemoryMovieRepository repo = new InMemoryMovieRepository();

        CreateMovieHandler createHandler = new CreateMovieHandler(repo);

        Movie movie = createHandler.handle(
                new CreateMovieCommand("Test", "ACTION", 7, "desc")
        );

        DeleteMovieHandler deleteHandler = new DeleteMovieHandler(repo);

        deleteHandler.handle(new DeleteMovieCommand(movie.getId()));

        assertNull(repo.findById(movie.getId()));
    }
}