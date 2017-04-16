package DesignPatterns.Behavioural.NullObject;

/**
 * Created by timmanas on 2017-04-15.
 */
public class NullObjectDesignPattern {

    public static void main(String [] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Tim");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("John");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Romero");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Manas");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());

    }
}

/**

 Null Object

 What ?
 - Behavioural
 - Replaces Null object checks (i.e " a == b" )
 - Instead of putting a a check of a null value, Null object provides a default behaviour
    in a null object

 Why ?
 - Instead of doing nothing, we need to provide an alternative when objects are null

 When ?
 - Need to alternative solution for things go null
 - Need an abstract way of handling null away from the client

 Notes
 - We still check for null but provide an alternative object which has some default behaviour

 Reference
 https://www.tutorialspoint.com/design_pattern/null_object_pattern.htm




 */
