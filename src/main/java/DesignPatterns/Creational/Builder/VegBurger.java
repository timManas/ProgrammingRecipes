package DesignPatterns.Creational.Builder;

/**
 * Created by timmanas on 2017-04-08.
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Vegetarian Burger";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
