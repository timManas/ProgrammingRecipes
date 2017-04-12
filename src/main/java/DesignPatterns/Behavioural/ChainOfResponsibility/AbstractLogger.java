package DesignPatterns.Behavioural.ChainOfResponsibility;

/**
 * Created by timmanas on 2017-04-11.
 */
public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    public int level;
    public AbstractLogger nextAbstractLogger;

    public void setNextLogger(AbstractLogger nextAbstractLogger){
        this.nextAbstractLogger = nextAbstractLogger;
    }
    public void logMessage(int level, String message){
        if(this.level <= level)
            write(message);

        if(this.nextAbstractLogger != null)
            nextAbstractLogger.logMessage(level, message);

    }

    public abstract void write(String message);

}
