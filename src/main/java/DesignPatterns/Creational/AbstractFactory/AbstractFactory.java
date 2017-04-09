package DesignPatterns.Creational.AbstractFactory;

/**
 * Created by timmanas on 2017-04-08.
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);
    public abstract Colour getColour(String colour);

}
