package day02;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private final String name;
    private final int length;
    private final List<String> cast;

    public Movie(String name, int length, List<String> cast) {
        this.name = name;
        this.length = length;
        this.cast = cast;
    }


    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public List<String> getCast() {
        return new ArrayList<>(cast);
    }
}