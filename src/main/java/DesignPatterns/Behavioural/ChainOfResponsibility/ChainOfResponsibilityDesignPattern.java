package DesignPatterns.Behavioural.ChainOfResponsibility;

/**
 * Created by timmanas on 2017-04-11.
 */
public class ChainOfResponsibilityDesignPattern {

    public static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        // This is the chain which allows the error to be chained together
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;

    }


    public static void main(String [] args){
        System.out.println("::: Chain of Responsibility :::");

        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is information ");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is debug information");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is Error information ");
    }

}

/**

 Chain of Responsibility Design Pattern .... i.e Blunt Circle / Everyone has chance to handle goods *wink*

 What ?
 - Behavioural
 - Launch & Leave request until a object handles the data
 - Gives a chance for multiple objects to handle the request

 Why ?
 - We need lose coupling of the data. i.e Separate the data from the sender

 When ?
 - When the data might need multiple objects to resolve the issue (Think of Atm which dispenses money, each bill represent an object)

 Notes
 - Pointer to the next object of the same type (i.e in this case it is AbstractLogger)
 - One directional linked list

 Reference

 */
