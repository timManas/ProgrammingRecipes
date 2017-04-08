package DesignPatterns.Bridge;

/**
 * Created by timmanas on 2017-04-08.
 */
public class BridgeDesignPattern {

    public static void main(String[] args){

        // Notice this has the same abstraction but different implementation since we are using "Red Circle" and "Blue Circle"
        Shape redCircle = new Circle(10, 10, 50 , new RedCircle());
        Shape blueCircle = new Circle(10, 10, 100, new BlueCircle());

        redCircle.draw();
        blueCircle.draw();

    }

}


/**

 Bride Design Pattern

 What ?
 - Structural
 - Looks very similar to the Adapter Design pattern but it is NOT
 - The main difference is that Bridge seperates a class interface from it's implementation

 Why ?
 - If you want to use the same abstraction but DIFFERENT IMPLEMENTATION without changing the client code

 When ?
 - Need to seperate abstraction from it's Implementation

 Notes
 - Uses an interface which acts as "Bridge" between the concrete classes and the interface Implementer
    - In this case, the interface which acts as bridge would be "DrawAPI" class.

 - For this example, the Circle can be drawn in different colours using the same abstraction but different bridge implementer classes.

 References
 Refer to https://www.tutorialspoint.com/design_pattern/bridge_pattern.htm


 */
