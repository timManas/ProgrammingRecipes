package DesignPatterns.Behavioural.Observer;

/**
 * Created by timmanas on 2017-04-17.
 */
public class ObserverDesignPattern {

    public static void main(String [] args) {

        System.out.println("::: Observer Design pattern :::");

        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("\nFirst state change: 15");
        subject.setState(15);

        System.out.println("\nSecond state change: 10");
        subject.setState(10);

    }
}

/**

 Observer Design Pattern  .... i.e "Broadcast receivers" / If one object changes, the others related objects change as well


 What ?
 - Behavioural
 - When one object changes, it's dependents are notified and updated automatically

 Why ?
 - We need a system which notifies other objects when the "main" object is modified (Ex. Broadcast receivers)

 When ?
 - Theres is one to many relationships

 Notes
 - Notice that everytime subject is modified, the observers produces different results for change
 - Also notice the subject contains a list of all the Objects which is to be modified.
 -

 References
 https://www.tutorialspoint.com/design_pattern/observer_pattern.htm

 */