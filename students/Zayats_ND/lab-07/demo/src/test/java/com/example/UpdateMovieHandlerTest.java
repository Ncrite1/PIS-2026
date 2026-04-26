package com.example;

import com.command.CreateMovieCommand;
import com.command.UpdateMovieCommand;
import com.command.handler.CreateMovieHandler;
import com.command.handler.UpdateMovieHandler;
import com.domain.model.Movie;
import com.port.out.InMemoryMovieRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UpdateMovieHandlerTest {

    @Test
    void shouldUpdateMovie() {

        InMemoryMovieRepository repo = new InMemoryMovieRepository();

        CreateMovieHandler createHandler = new CreateMovieHandler(repo);

        Movie movie = createHandler.handle(
                new CreateMovieCommand("Old", "DRAMA", 5, "old desc")
        );

        UpdateMovieHandler updateHandler = new UpdateMovieHandler(repo);

        Movie updated = updateHandler.handle(
                new UpdateMovieCommand(
                        movie.getId(),
                        "New Title",
                        "ACTION",
                        8,
                        "new desc"
                )
        );

        assertEquals("New Title", updated.getTitle().value());
        assertEquals("ACTION", updated.getGenre().value());
        assertEquals(8, updated.getRating().value());
    }
}