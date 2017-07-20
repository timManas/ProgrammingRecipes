package DesignPatterns.Structural.Decorator;

/**
 * Created by timmanas on 2017-04-09.
 */
public class DecoratorDesignPattern {

    public static void main(String[] args){
        System.out.println("::: Decorator Design Pattern :::");

        // This is our object
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        // This is what we decorate our object with
        Shape redCircle = new RedShapeDecorator(circle);
        System.out.println("Circle of Red border");
        redCircle.draw();


        // Another original object
        Shape rectangle = new Rectangle();
        System.out.println("\nRectangle with normal border");
        rectangle.draw();

        // This is what we decorate our object with
        Shape redRectangle = new RedShapeDecorator(rectangle);
        System.out.println("Rectangle with Red border");
        redRectangle.draw();


    }
}

/**

 Decorator Design Pattern ... I.E  Tony Stark & the Iron Man Suits / Same man different Suits.

 What ?
 - Structural
 - Allows adding new functionality to an EXISITING object dynamically without altering it's structure


 Why ?
 - Because we need to add new behaviours dynamically.
 - We do not want to subclass for addition functionality.


 When ?
 - When we need different flavours of the same object by adding new features
 - Object behaviour and responsibilities should be dynamically modifiable
 - Concrete implementation need to be decoupled from responsibilities and behaviour


 Notes
 - Notice we create a "wrapper" class which encapsulates the original class and provides additional functionality
   while keeping struture in place
 - We cannot add more variable members to the object but only change the state of the object (ex. changing colour)


 Reference
 https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm

 */
