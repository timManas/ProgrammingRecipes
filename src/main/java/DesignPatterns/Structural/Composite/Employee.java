package DesignPatterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timmanas on 2017-04-09.
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;            // This List is what allows the object to store multiple objects of the same type.

    public Employee(String name, String dept, int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee employee){
        subordinates.add(employee);
    }

    public void remove(Employee employee){
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates(){
        return this.subordinates;
    }

    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }

}

