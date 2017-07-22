package DesignPatterns.Behavioural.Memento;

/**
 * Created by timmanas on 2017-04-15.
 */
public class MementoDesignPattern {

    public static void main(String [] args) {

        System.out.println("::: Memento Design Pattern");

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        System.out.println("Originator state: " + originator.getState());
        careTaker.add(originator.saveStateToMoment());

        originator.setState("State #3");
        System.out.println("Originator state: " + originator.getState());
        careTaker.add(originator.saveStateToMoment());

        originator.setState("State #4");
        System.out.println("Originator state: " + originator.getState());

        originator.getStateFromMomento(careTaker.get(0));
        System.out.println("Current Originator state: " + originator.getState());


        originator.setState("State #10");
        careTaker.add(originator.saveStateToMoment());

        originator.getStateFromMomento(careTaker.get(careTaker.getMementoList().size() - 1));
        System.out.println("Current Originator state: " + originator.getState());



    }

}


/**

 Memento Design Pattern .... i.e "Save Button" / Save a state of an object for use later

 What ?
 - Behavioural
 - Saves the state of an object and allows the state to be set
 - Restores a state of an object to it's previous state

 Why ?
 - Need a way to roll-back an object to it's previous state

 When ?
 - When we need to save multiple states of the object and use them later on

 Notes
 - Notice that we use a List to store all the previous states of the objects
 - Very similar to saving a game. We can save the gane in various states
 - We have three objects "Originator", "Caretaker" & "Memento".
 - The originator is some object that has an internal state
 - The Caretaker manipulates the originator but has the ability to undo changes
    - They also have  list of all memento objects
 - Memento is actually an OBJECT which has reference to single state. This SHOULD NOT CHANGE

 References
 https://www.tutorialspoint.com/design_pattern/memento_pattern.htm

 */