package DesignPatterns.Behavioural.State;

/**
 * Created by timmanas on 2017-04-17.
 */
public class Context {

    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
