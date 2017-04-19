package DesignPatterns.Behavioural.MVC;

/**
 * Created by timmanas on 2017-04-18.
 */
public class Student {

    private String rollNumber;
    private String name;

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
