package com.example.movieapi.controller;

import com.example.movieapi.entity.Movie;
import com.example.movieapi.service.MovieService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")  // Enable CORS for React frontend
public class MovieController {

    @Autowired
    private MovieService movieService;

    // Simple GET endpoint to test if the server is running
    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to the Movie API!";
    }

    // POST request to add movies using the Movie entity
    @PostMapping("/movies")
    public String createMovie(@RequestBody Movie movie) {
        movieService.saveMovie(movie);
        return "Movie added successfully!";
    }

    // GET request to fetch all movies
    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }
}
