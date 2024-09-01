package exercise4;

public class Movie implements Comparable<Movie> {
    private String name;
    private int year;

    public Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "%s (%d)".formatted(name, year);
    }
}
