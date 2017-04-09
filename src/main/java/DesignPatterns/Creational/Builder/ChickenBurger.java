package DesignPatterns.Creational.Builder;

/**
 * Created by timmanas on 2017-04-08.
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 10.0f;
    }

}
