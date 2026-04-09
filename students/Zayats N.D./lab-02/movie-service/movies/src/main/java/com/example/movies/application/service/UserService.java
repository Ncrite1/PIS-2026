package com.example.movies.application.service;

import com.example.movies.application.port.in.GetMovieDetailsUseCase; 
import com.example.movies.application.port.in.SomeUserUseCase;      

public class UserService implements SomeUserUseCase { 
    @Override
    public Object someUserMethod(Object command) {
        return null;
    }
}