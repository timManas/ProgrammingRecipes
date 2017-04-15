package DesignPatterns.Behavioural.Memento;

/**
 * Created by timmanas on 2017-04-15.
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
