/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.movie;

import com.example.movie.Movie;
import com.example.movie.MovieService;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@RestController

class MovieController {
    MovieService movieService = new MovieService();

    @GetMapping("/movies")
    public ArrayList<Movie> getMovies() {
        return movieService.getMovies();
    }

    @PostMapping("/movies")
    public Movie addMovies(@RequestBody Movie movie) {
        return movieService.addMovies(movie);
    }

    @GetMapping("/movies/{movieId}")
    public Movie getMovieById(@PathVariable int movieId) {
        return movieService.getMovieById(movieId);
    }

    @PutMapping("/movies/{movieId}")
    public Movie updateMovie(@PathVariable int movieId, @RequestBody Movie movie) {
        return movieService.updateMovie(movieId, movie);
    }

    @DeleteMapping("/movies/{movieId}")
    public void deleteMovie(@PathVariable int movieId) {
        movieService.deleteMovie(movieId);
    }
}