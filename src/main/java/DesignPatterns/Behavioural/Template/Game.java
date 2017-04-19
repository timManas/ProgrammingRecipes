package DesignPatterns.Behavioural.Template;

/**
 * Created by timmanas on 2017-04-18.
 */
public abstract class Game {

    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    // Template Method
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

}
