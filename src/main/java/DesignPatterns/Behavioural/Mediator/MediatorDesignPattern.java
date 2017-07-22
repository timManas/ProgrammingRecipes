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

 Mediator Design Pattern ... it literally is what it is "Mediator" ... i.e "Middle Man" Especially in Divorce =)

 What ?
 - Behavioural
 - An object class encapsulates how objects communicates with each other
 - We need to define a "Mediator" object which handles all communication

 Why ?
 - Reduce communication complexity between multiple objects or classes
 - Lose coupling of communication by keeping objects from Referring each other
 - Promotes many to many relationships

 When ?
 - Objects cannot refer to each other and need loose coupling
 - Need a "middle man"
 - A mediator class handles the communication between objects/classes

 Notes
 - Remember, communication is between object to object. Not class to class

 References



 */