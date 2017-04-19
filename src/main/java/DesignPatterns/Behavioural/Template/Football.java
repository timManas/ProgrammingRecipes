package DesignPatterns.Behavioural.Template;

/**
 * Created by timmanas on 2017-04-18.
 */
public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("Initializing Football Game");
    }

    @Override
    public void startPlay() {
        System.out.println("Starting Football Game");
    }

    @Override
    public void endPlay() {
        System.out.println("End Football Game");
    }
}
