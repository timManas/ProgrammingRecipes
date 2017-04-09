package DesignPatterns.Creational.Builder;

/**
 * Created by timmanas on 2017-04-08.
 */
public abstract class Burger implements Item{

    @Override
    public Packaging packaging() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
