package DesignPatterns.Creational.Factory;

/**
 * Created by timmanas on 2017-04-08.
 */
public class FactoryDesignPattern {

    public static void main(String[] args){
        System.out.println("Factory Design Pattern");

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Circle");
        Shape shape2 = shapeFactory.getShape("Square");
        Shape shape3 = shapeFactory.getShape("Rectangle");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }

}


/**

 Factory Design Pattern

 What ?
 - Creational
 - Create new object without exposing creation code to the user

 Why ?
 - Allows us to create different types of objects using the same interface

 When ?
 - We do not want the client to constantly create  just type "new" everywhere
 - We need to create ONE object which are similar to each other (Hench the interface)

 Notes
 - Provides a centralized methodology for creating objects

 */