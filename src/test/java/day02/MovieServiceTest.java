package day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieServiceTest {
    @Test
    void testMovieService() {
        MovieService movieService = new MovieService();
        Movie m1 = new Movie("Die 1", 65, List.of("Wind", "Earth"));
        Movie m2 = new Movie("Die 2", 100, List.of("Steel", "Cooper"));
        Movie m3 = new Movie("Die 3", 70, List.of("Rock", "Water"));
        Movie m4 = new Movie("Die 4", 80, List.of("Iron", "Rust"));
        movieService.addMovie(m1);
        movieService.addMovie(m2);
        movieService.addMovie(m3);
        movieService.addMovie(m4);

        assertEquals(100, movieService.getLongestLength());
        assertEquals(List.of(m1, m2, m3), movieService.getMoviesWithActor("Rock"));
    }
}