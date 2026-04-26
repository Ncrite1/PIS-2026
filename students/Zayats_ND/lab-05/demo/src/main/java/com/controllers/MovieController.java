package com.controllers;

import com.command.CreateMovieCommand;
import com.command.UpdateMovieCommand;
import com.command.DeleteMovieCommand;
import com.command.handler.CreateMovieHandler;
import com.command.handler.UpdateMovieHandler;
import com.command.handler.DeleteMovieHandler;
import com.query.GetMovieQuery;
import com.query.handler.GetMovieHandler;
import com.domain.model.Movie;
import com.port.out.MovieRepository;  // ← ВАЖНО: правильный импорт

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final CreateMovieHandler createHandler;
    private final UpdateMovieHandler updateHandler;
    private final DeleteMovieHandler deleteHandler;
    private final GetMovieHandler getHandler;
    private final MovieRepository movieRepository;  // ← Добавлено поле

    // Конструктор с MovieRepository
    public MovieController(CreateMovieHandler createHandler,
                           UpdateMovieHandler updateHandler,
                           DeleteMovieHandler deleteHandler,
                           GetMovieHandler getHandler,
                           MovieRepository movieRepository) {  // ← Добавлен параметр
        this.createHandler = createHandler;
        this.updateHandler = updateHandler;
        this.deleteHandler = deleteHandler;
        this.getHandler = getHandler;
        this.movieRepository = movieRepository;  // ← Инициализация
    }

    @PostMapping
    public void create(@RequestBody CreateMovieCommand command) {
        createHandler.handle(command);
    }

   @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable Long id) {
        GetMovieQuery query = new GetMovieQuery(id);
        Movie movie = getHandler.handle(query);  // ← Изменено: убрали Optional
        
        if (movie != null) {  // ← Изменено: проверка на null
            return ResponseEntity.ok(movie);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Фильм с ID " + id + " не найден");
        }
    }
    @PutMapping("/{id}")
    public void update(@PathVariable Long id,
                       @RequestBody UpdateMovieCommand command) {
        updateHandler.handle(command);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        deleteHandler.handle(new DeleteMovieCommand(id));
    }

    @GetMapping("/test")
    public String test() {
        return "OK";
    }

    // Новый метод для просмотра всех фильмов
    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        Iterable<Movie> movies = movieRepository.findAll();
        return ResponseEntity.ok(movies);
    }
}