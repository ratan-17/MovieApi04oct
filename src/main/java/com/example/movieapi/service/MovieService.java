package com.example.movieapi.service;

import com.example.movieapi.entity.Movie;
import com.example.movieapi.repository.MovieRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);  // Persist the movie to the DB
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();  // Fetch all movies from the DB
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);  // Fetch movie from the DB
    }
}
