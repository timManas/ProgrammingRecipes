package DesignPatterns.Behavioural.Template;

/**
 * Created by timmanas on 2017-04-18.
 */
public class TemplateDesignPattern {

    public static void main(String [] args) {
        System.out.println("::: Template Design Pattern :::");

        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();

    }

}

/**

 Template Design Pattern

 What ?
 - Behavioural
 - Allows subclasses to define it's own behaviour
 - Invocation is defined the same as per the abstract class

 Why ?
 - We want the client to have some control of how the object will behave
 - The parent object still controls the sequence of events
 - Avoid duplication of the code

 When ?
 - We want the subclass to implement different behaviour but want the parent to define the structure

 Notes
 - The abstract defines the general SEQUENCE but the subclasses define the behaviour

 References
 https://www.tutorialspoint.com/design_pattern/template_pattern.htm


 */
