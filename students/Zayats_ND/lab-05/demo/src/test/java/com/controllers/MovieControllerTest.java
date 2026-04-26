package com.controllers;

import com.command.CreateMovieCommand;
import com.command.handler.CreateMovieHandler;
import com.query.GetMovieQuery;
import com.query.handler.GetMovieHandler;
import com.domain.model.Movie;
import com.domain.value_objects.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MovieControllerTest {

    @Mock
    private CreateMovieHandler createHandler;

    @Mock
    private GetMovieHandler getHandler;

    @InjectMocks
    private MovieController movieController;

    private Movie testMovie;

    @BeforeEach
    void setUp() {
        testMovie = new Movie(
            1L,
            new MovieTitle("Начало"),
            new Genre("Фантастика"),
            new Rating(8.8),
            new Description("Отличный фильм про сны")
        );
    }

    @Test
    void getMovieById_ShouldReturnMovie_WhenMovieExists() {
        // Arrange
        when(getHandler.handle(any(GetMovieQuery.class))).thenReturn(testMovie);

        // Act
        ResponseEntity<?> response = movieController.get(1L);

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        verify(getHandler, times(1)).handle(any(GetMovieQuery.class));
    }

    @Test
    void getMovieById_ShouldReturnNotFound_WhenMovieDoesNotExist() {
        // Arrange
        when(getHandler.handle(any(GetMovieQuery.class))).thenReturn(null);

        // Act
        ResponseEntity<?> response = movieController.get(999L);

        // Assert
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        assertEquals("Фильм с ID 999 не найден", response.getBody());
        verify(getHandler, times(1)).handle(any(GetMovieQuery.class));
    }

    @Test
    void createMovie_ShouldCallCreateHandler() {
        // Arrange
        CreateMovieCommand command = new CreateMovieCommand(
            "Матрица",
            "Фантастика",
            9,
            "Культовый фильм про матрицу"
        );
        
        // Просто вызываем метод - не нужно doNothing()
        // Act
        movieController.create(command);

        // Assert
        verify(createHandler, times(1)).handle(command);
    }

    @Test
    void testEndpoint_ShouldReturnOk() {
        // Act
        String result = movieController.test();

        // Assert
        assertEquals("OK", result);
    }
}