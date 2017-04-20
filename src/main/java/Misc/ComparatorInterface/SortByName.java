package Misc.ComparatorInterface;

import java.util.Comparator;

/**
 * Created by timmanas on 2017-04-20.
 */
public class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}
