package Misc.ComparatorVsComparable.Comparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by timmanas on 2017-04-20.
 */
public class Main {

    public static void main(String [] args) {
        System.out.println("::: Comparator :::");


        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(8.3,"Force Awakens",  2015));
        list.add(new Movie( 8.7,"Star Wars", 1977));
        list.add(new Movie( 8.8,"Empire Strikes Back", 1980));
        list.add(new Movie( 8.4, "Return of the Jedi",1983));


        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie movie: list)
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());


        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie: list)
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());


        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (Movie movie: list)
            System.out.println(movie.getYear() + " " + movie.getRating() + " " + movie.getName()+" ");

    }
}

/**

 Comparator
 - Provides customizated way of comparing. In this case, we compare by Name, Year or Rating

 Notes
 - Notice we had to create multiple comparator classes, each with their own unique comparison algorithm
 - We can implement both comparable and comporator together. Comparable with the default comparing algorithm while comparator provides a customized way to sorting
 - For comparator, we just need to create multiple classes which implement different comparison algorithms
 - Allows for loose coupling and better modularization

 */


