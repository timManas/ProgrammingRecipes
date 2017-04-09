package DesignPatterns.Creational.Builder;

/**
 * Created by timmanas on 2017-04-08.
 */
public abstract class Colddrink implements Item {

    @Override
    public Packaging packaging() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
