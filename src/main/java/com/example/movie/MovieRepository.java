// Write your code here
package com.example.movie;

import com.example.movie.*;
import java.util.*;

public interface MovieRepository {
    ArrayList<Movie> getMovies();

    Movie addMovies(Movie movie);

    Movie getMovieById(int movieId);

    Movie updateMovie(int movieId, Movie movie);

    void deleteMovie(int movieId);
}