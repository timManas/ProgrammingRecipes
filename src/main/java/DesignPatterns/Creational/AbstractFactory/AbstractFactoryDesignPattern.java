package DesignPatterns.Creational.AbstractFactory;

/**
 * Created by timmanas on 2017-04-08.
 */
public class AbstractFactoryDesignPattern {

    public static void main(String[] args){
        System.out.println(" ::: Abstract Factory Design Pattern ::: ");

        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory abstractFactory;

        // Notice abstractFactory is Now a ShapeFACTORY
        abstractFactory = factoryProducer.getFactory("Shape");
        Shape shape1 = abstractFactory.getShape("Circle");
        Shape shape2 = abstractFactory.getShape("Square");
        Shape shape3 = abstractFactory.getShape("Rectangle");
        shape1.draw();
        shape2.draw();
        shape3.draw();

        // Notice abstractFactory is NOW a Color Factory
        abstractFactory = factoryProducer.getFactory("Colour");
        Colour colour1 = abstractFactory.getColour("Red");
        Colour colour2 = abstractFactory.getColour("Blue");
        Colour colour3 = abstractFactory.getColour("Green");

        colour1.fill();
        colour2.fill();
        colour3.fill();


    }

}

/**

 Abstract Factory Design pattern

 What ?
 - Creational
 - Creates Factory of Factories

 Why ?
 - Centralized object creation


 When ?
 - The "new" keyword considered harmful
 - When we want an application to be portable without many dependecies
 - We have alot of similar objects to be created and needed one interface to create objects

 How ?
 - First we specify the type of factory we use to utilize
 - We create the objects produced by the factory

 Notes
 - Notice that we first define which factory we want to use, then we define what shape we are looking for
 - Notice that we only have one Factory Producer
 - Each Factory creates the concrete object
 - Developers ususally start with a simple factory and evolve to an Abstract factory as more objects are needed

 */
