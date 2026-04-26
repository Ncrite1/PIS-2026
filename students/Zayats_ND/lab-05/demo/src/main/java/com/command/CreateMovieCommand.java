package com.command;

public final class CreateMovieCommand {

    private final String title;
    private final String genre;
    private final int rating;
    private final String description;

    public CreateMovieCommand(String title, String genre, int rating, String description) {
        if (title == null || title.isBlank()) throw new IllegalArgumentException("Title is invalid");
        if (genre == null || genre.isBlank()) throw new IllegalArgumentException("Genre is invalid");
        if (rating < 0 || rating > 10) throw new IllegalArgumentException("Rating must be 0-10");
        if (description == null) throw new IllegalArgumentException("Description is required");

        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.description = description;
    }

    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getRating() { return rating; }
    public String getDescription() { return description; }
}