package Misc.ComparatorInterface;

import java.util.Comparator;

/**
 * Created by timmanas on 2017-04-20.
 */
public class SortByRoll implements Comparator <Student> {


    // We use for ascending order of the roll number
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getRollNo() - student2.getRollNo();
    }
}
