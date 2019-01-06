package DesignPatterns.Structural.Composite;

/**
 * Created by timmanas on 2017-04-09.
 */
public class CompositeDesignPattern {

    public static void main(String[] args){

        System.out.println("::: Composite Design Pattern :::");

        Employee CEO = new Employee("Timothy Manas", "Executive", 1000000000);
        Employee CTO = new Employee("Mero", "Engineering", 50000);
        Employee CFO = new Employee("Romero", "Accounting", 70000);

        Employee engineer1 = new Employee("Obama", "Engineering", 4500);
        Employee engineer2 = new Employee("Joe Biden", "Engineering", 32324);

        Employee salesRep1 = new Employee("SommerRay", "Business", 233443);
        Employee salesRep2 = new Employee("Sara Jean", "Account", 233345);

        CEO.add(CTO);
        CEO.add(CFO);

        CTO.add(engineer1);
        CTO.add(engineer2);

        CFO.add(salesRep1);
        CFO.add(salesRep2);

        for(Employee executive : CEO.getSubordinates()){
            System.out.println(":::: " + executive);

            for(Employee member : executive.getSubordinates()){
                System.out.println(member);
            }

        }

    }
}

/**

 Composite Design Pattern ... i.e Group of Objects as One Entity / "Composing Off"

 What ?
 - Creates a class that contains group of it's own objects
 - Provides a way to modify it's own group

 Why ?
 - Compose objects into tree structures to represent hierarchies
 - Able to identify leaf / nodes in a hierarchy
 - Can use Recursion to find information about a subtree (i.e Salaries of IT department only..managers + all employees under his chain)
 

 When ?
 - We need to treat a group of objects as a single Object (Employee and their subordinates)

 Notes
 - We can create groups which can represent hierarchies
 - "Directories can contain entries, which also be another directory"
 - Utilize recursion for finding child elements
 - Nodes HAVE TO BE OF THE SAME TYPE ...otherwise you cant store a particular object with another object



 */
