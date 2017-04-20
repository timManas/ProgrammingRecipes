package Misc.ComparatorVsComparable.Comparator;

import java.util.Comparator;

/**
 * Created by timmanas on 2017-04-20.
 */
public class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {

        if (movie1.getRating() < movie2.getRating())
            return -1;
        if (movie1.getRating() > movie2.getRating())
            return 1;
        else
            return 0;
    }
}
