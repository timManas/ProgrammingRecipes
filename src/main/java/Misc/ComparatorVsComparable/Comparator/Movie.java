package Misc.ComparatorVsComparable.Comparator;

/**
 * Created by timmanas on 2017-04-20.
 */
public class Movie implements Comparable<Movie> {

    private double rating;
    private String name;
    private int year;

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }


    public String toString() {
        return "Name: " + name + "  Rating: " + rating + "  Year:" + year;
    }

    @Override
    public int compareTo(Movie movie) {
        return this.getYear() - movie.getYear();
    }
}
