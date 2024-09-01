package exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Annabele", 2018));
        movies.add(new Movie("Zoro", 2005));
        movies.add(new Movie("Thor", 2012));
        movies.add(new Movie("Avengers", 2014));
        System.out.printf("List with order: %s\n", movies);
        Collections.sort(movies);
        System.out.printf("Ordered list using comparable: %s\n", movies);
        movies.sort(Comparator.comparing(Movie::getYear));
        System.out.printf("Ordered list using comparator to year: %s", movies);
    }
}
