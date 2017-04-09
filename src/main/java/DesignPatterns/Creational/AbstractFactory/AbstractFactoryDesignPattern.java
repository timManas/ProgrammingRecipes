package DesignPatterns.Creational.AbstractFactory;

/**
 * Created by timmanas on 2017-04-08.
 */
public class AbstractFactoryDesignPattern {

    public static void main(String[] args){
        System.out.println(" ::: Abstract Factory Design Pattern ::: ");

        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory shapeFactory = factoryProducer.getFactory("Shape");
        Shape shape1 = shapeFactory.getShape("Circle");
        Shape shape2 = shapeFactory.getShape("Square");
        Shape shape3 = shapeFactory.getShape("Rectangle");
        shape1.draw();
        shape2.draw();
        shape3.draw();

        AbstractFactory colourFactory = factoryProducer.getFactory("Colour");
        Colour colour1 = colourFactory.getColour("Red");
        Colour colour2 = colourFactory.getColour("Blue");
        Colour colour3 = colourFactory.getColour("Green");

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

 Notes
 - Notice that we first define which factory we want to use, then we define what shape we are looking for
 - Notice that we only have one Factory Producer
 - Each Factory creates the concrete object
 - Developers ususally start with a simple factory and evolve to an Abstract factory as more objects are needed

 */
