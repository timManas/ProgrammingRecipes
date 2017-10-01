package Misc.Abstract_Interfaces.AbstractClasses;

/**
 * Created by timmanas on 2017-08-17.
 */
public class AbstractExample {

    public static void main (String [] args) {

        //This does not work since we cannot instantiate Abstract Classes
//        Base base = new Base();

        // We can REFERENCE Base types
        Base base = new Derived();      // Note that the Base Constructor gets called first then the Derived Constructor
        base.baseHelperMethod();        // This works
        base.finalBaseMethod();
        base.staticMethod();            // When a method is declared static, Runtime Polymorphism does not Happen !!!

        System.out.println("\n =========\n");

        // We can call Non-abstract methods in an abstract class
        Derived derived = new Derived();
        derived.baseHelperMethod();        // This Works

        System.out.println("\n =========\n");

        // Abstract classes can also have final methods (Methods which cannot be overriden)
        derived.finalBaseMethod();        // This works

        System.out.println("\n =========\n");
        System.out.println("Derived Name: " + derived.name);
//        System.out.println("Derived Type: " + derived.type);     // Does not work since type is private
        System.out.println("Derived Info: " + derived.info);
        System.out.println("Derived Case: " + derived.derivedCase);


    }

}

/**

 Abstract Classes & Methods

 What ?
 - Class which is declared Abstract
 - Are classes which contain one or more abstract methods
 - Requires a sub class to provide implementation
 - Abstract methods are methods  which have been declared but not implemented

 Why ?

 Notes
 - Abstract Classes cannot be instantiated
 - When abstract class is subclassed, the subclass MUST provides implementation for all methods in the parent class
 - IF IT DOES NOT, then the subblass is also declared Abstract
 - We can have references to Abstract classes which takes ....ex:   Base base = new Derived();
 - If class contains an abstract method, then the class MUST be declared Abstract
 - Abstract Classes can contain constructors
 - When you instantiate the SubClass, the Parent class constructor is called first then the subclass constructor ex.  Base base = new Derived();
 - When a method is declared static, Runtime Polymorphism does not Happen !!!


 References
 - http://www.geeksforgeeks.org/abstract-classes-in-java/


 */
