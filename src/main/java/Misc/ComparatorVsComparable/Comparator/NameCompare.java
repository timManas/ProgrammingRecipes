package Misc.ComparatorVsComparable.Comparator;

import java.util.Comparator;

/**
 * Created by timmanas on 2017-04-20.
 */
public class NameCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getName().compareTo(movie2.getName());
    }
}
