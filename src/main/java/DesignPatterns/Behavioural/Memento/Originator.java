package DesignPatterns.Behavioural.Memento;

/**
 * Created by timmanas on 2017-04-15.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMoment() {
        return new Memento(state);
    }

    public void getStateFromMomento(Memento memento) {
        state = memento.getState();
    }


}
