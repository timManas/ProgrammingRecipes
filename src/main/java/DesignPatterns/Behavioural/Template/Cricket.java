package DesignPatterns.Behavioural.Template;

/**
 * Created by timmanas on 2017-04-18.
 */
public class Cricket extends Game {

    @Override
    public void initialize() {
        System.out.println("Initializing Cricket Game");
    }

    @Override
    public void startPlay() {
        System.out.println("Start Cricket Game");
    }

    @Override
    public void endPlay() {
        System.out.println("End Cricket Game");
    }
}
