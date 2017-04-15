package DesignPatterns.Behavioural.Mediator;

/**
 * Created by timmanas on 2017-04-15.
 */
public class MediatorDesignPattern {

    public static void main(String [] args){
        System.out.println("::: Mediator Design Pattern :::");


        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hello World");
        john.sendMessage("Hi HI hI hI");

    }

}


/**

 Mediator Design Pattern

 What ?
 - Behavioural
 - An object class encapsulates how objects communicates with each other
 - We need to define a "Mediator" object which handles all communication

 Why ?
 - Reduce communication complexity between multiple objects or classes
 - Lose coupling of communication by keeping objects from Referring each other
 - Promotes many to many relationships

 When ?
 - A mediator class handles the communication between objects/classes

 Notes

 References



 */