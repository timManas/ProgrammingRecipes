package DesignPatterns.Behavioural.State;

/**
 * Created by timmanas on 2017-04-17.
 */
public class StateDesignPattern {

    public static void main(String [] args) {
        System.out.println("::: State Design Pattern :::");

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}


/**

 State Design Pattern

 What ?
 - Behavioural
 - Depending on the current state of the object, the behaviour changes
 - We create various objects which represent states and a context object whose behaviour changes when the state changes
 -

 Why ?
 - We want the object to behaviour differently depending on it's state

 When ?
 - When we have multiple states and require the same object to change it's behaviour.

 Notes
 - State objects are often singletons



 */