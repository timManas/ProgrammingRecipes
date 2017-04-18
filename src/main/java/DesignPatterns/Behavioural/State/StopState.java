package DesignPatterns.Behavioural.State;

/**
 * Created by timmanas on 2017-04-17.
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in Stop State");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
