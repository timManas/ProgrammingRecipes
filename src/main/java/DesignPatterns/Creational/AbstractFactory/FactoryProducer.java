package DesignPatterns.Creational.AbstractFactory;

/**
 * Created by timmanas on 2017-04-08.
 */
public class FactoryProducer {

    public FactoryProducer(){
        System.out.println("Creating new Factory Producer");
    }

    public AbstractFactory getFactory(String factoryType){

        switch (factoryType){

            case "Shape":{
                return new ShapeFactory();
            }

            case "Colour":{
                return new ColourFactory();
            }
        }

        return null;
    }
}
