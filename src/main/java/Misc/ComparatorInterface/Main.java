package Misc.ComparatorInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by timmanas on 2017-04-20.
 */
public class Main {

    public static void main(String [] args) {

        System.out.println("::: Comparator Interface :::");

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "James", "Baker Street"));
        studentList.add(new Student(202, "Jane", "Danger Avenue"));
        studentList.add(new Student(303, "Erin", "You don fucked up street"));

        // Unsorted List
        for(Student student : studentList)
            System.out.println("UnSorted Name:" + student.getName() + "    Roll #:" + student.getRollNo());

        Collections.sort(studentList, new SortByName());
        for(Student student : studentList)
            System.out.println("Sorted By Name:" + student.getName() + "    Roll #:" + student.getRollNo());

        Collections.sort(studentList, new SortByRoll());
        for(Student student : studentList)
            System.out.println("Sorted By Roll Number ::: Name:" + student.getName() + "    Roll #:" + student.getRollNo());

    }

}

/**

 Notes
 - Notice that the comparator has a return value of "int"
 - We cannot compare using boolean because it will fuck shit up
 - For sorting in descending value, just change the order of Student 1 and Student 2.

 How does this work ?
 - The comparator does a call Compare method by asking "Which is greater" ?
 - The compare method returns  -1 (Less than), 0 (Equal), 1 (More than). Uses this value to determine if it should be swapped

 */
