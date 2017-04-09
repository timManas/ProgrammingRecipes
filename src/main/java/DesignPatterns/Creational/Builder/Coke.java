package DesignPatterns.Creational.Builder;

/**
 * Created by timmanas on 2017-04-08.
 */
public class Coke extends Colddrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 4.0f;
    }
}
