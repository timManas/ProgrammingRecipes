package DesignPatterns.Behavioural.ChainOfResponsibility;

/**
 * Created by timmanas on 2017-04-11.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("File Logger - " + message);
    }
}
