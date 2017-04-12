package DesignPatterns.Behavioural.ChainOfResponsibility;

/**
 * Created by timmanas on 2017-04-11.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("Error Logger - " + message);
    }
}
