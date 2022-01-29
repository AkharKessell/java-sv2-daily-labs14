package day02;

import java.util.ArrayList;
import java.util.List;

public class MovieService {
    private final List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getMoviesWithActor(String actor) {
        return movies.stream()
                .filter(movie -> movie.getActors().contains(actor))
                .toList();
    }

    public int getLongestLength() {
        return movies.stream()
                .mapToInt(Movie::getLength)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("empty list"));
    }
}