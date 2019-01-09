package Misc.ComparatorVsComparable.Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by timmanas on 2017-04-20.
 */
public class Main {

    public static void main(String [] args) {

        System.out.println("::: Comparable :::");

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie(4, "Hello World", 1932));
        movieList.add(new Movie(2, "Hello Die", 1952));
        movieList.add(new Movie(6, "Hello Erin", 1922));
        movieList.add(new Movie(8, "Hello Tim", 1972));

        Collections.sort(movieList);

        for(Movie movie : movieList)
            System.out.println(movie.toString());

    }

}

/**

 Comporable
 - This is a built in interface
 - You need to specify the default behaviour when implementing this interface
 - Provide a default behaviour

 Notes
 - A comparable object is capable of comparing itself with another object
 - If we have multiple things we need to compare we should use Comparator instead because it allows interchangeable algorithms



 */
