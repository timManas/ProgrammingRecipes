package DesignPatterns.Behavioural.Observer;

/**
 * Created by timmanas on 2017-04-17.
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toOctalString(subject.getState()));
    }
}
