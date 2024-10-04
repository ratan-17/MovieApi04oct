// package com.example.movieapi.service;

// import com.example.movieapi.entity.Movie;
// import com.example.movieapi.repository.MovieRepository;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.MockitoAnnotations;

// import static org.mockito.Mockito.verify;
// import static org.mockito.Mockito.when;
// import static org.junit.jupiter.api.Assertions.*;

// public class MovieServiceTest {

//     @InjectMocks
//     private MovieService movieService;

//     @Mock
//     private MovieRepository movieRepository;

//     @BeforeEach
//     public void setUp() {
//         MockitoAnnotations.openMocks(this);
//     }

//     @Test
//     public void testSaveMovie() {
//         Movie movie = new Movie("Inception", "A mind-bending thriller");
//         when(movieRepository.save(movie)).thenReturn(movie);

//         Movie savedMovie = movieService.saveMovie(movie);
//         assertEquals("Inception", savedMovie.getTitle());
//         verify(movieRepository).save(movie);
//     }

//     @Test
//     public void testGetMovieById() {
//         Movie movie = new Movie("Inception", "A mind-bending thriller");
//         when(movieRepository.findById(1L)).thenReturn(java.util.Optional.of(movie));

//         Movie fetchedMovie = movieService.getMovieById(1L);
//         assertEquals("Inception", fetchedMovie.getTitle());
//         verify(movieRepository).findById(1L);
//     }
// }