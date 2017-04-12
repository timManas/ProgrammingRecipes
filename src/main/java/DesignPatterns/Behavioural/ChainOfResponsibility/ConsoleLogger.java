package DesignPatterns.Behavioural.ChainOfResponsibility;

/**
 * Created by timmanas on 2017-04-11.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }
    @Override
    public void write(String message) {
        System.out.println("Console Logger - " + message);
    }
}
