package DesignPatterns.Structural.Facade;

/**
 * Created by timmanas on 2017-04-09.
 */
public class FacadeDesignPattern {

    public static void main(String [] args){
        System.out.println("::: Facade Design Pattern :::");

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

    }

}


/**

 Facade Design Pattern .. i.e Simple Interface for Dumbasses / "Cellphone .. Beep Beep"

 What ?
 - Structural
 - Hides complexity of the system and provides an interface for the client to use to interact
 - Provides a single class which provides "SIMPLIFIED" methods required by the client (i.e. Dumb it down enough for the client to use)


 Why ?
 - Need a simple interface which hides a complex system


 Where ?
 - We have a complex system and we need a centralized interface for the client to interact with the system


 Notes
 - Provides a very simple interface for the client to interact with the system (ex. ATM Machine User Interface, Customer serverice Rep on the phone)
 - Usually just has one interface for the client

 References
 https://www.tutorialspoint.com/design_pattern/facade_pattern.htm

 */