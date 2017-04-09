package DesignPatterns.Structural.Flyweight;

import java.util.HashMap;

/**
 * Created by timmanas on 2017-04-09.
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> map = new HashMap();

    public static Shape getCircle(String colour){
        Circle circle = (Circle) map.get(colour);

        if(circle == null){
            circle = new Circle(colour);
            map.put(colour, circle);
            System.out.println("\nCreating circle of colour: " + colour );
        }

        return circle;
    }

}

/**

 Flyweight Design Pattern

 What ?
 - Structural
 - Used to reduce the number of objects created & decrease memory footprint
 - Tries to reuse existing objects

 Why ?
 - For performance reasons

 When ?
 - We need to create a very LARGE number of similar objects efficiently
 - Many similar objects are used and memory is expensive


 Notes
 - Notice we had to create a Factory for this to work
 - Only if the object does not exist do we create an new object and add it to the map (kinda like an object pool)

 References
 https://www.tutorialspoint.com/design_pattern/flyweight_pattern.htm



 */
