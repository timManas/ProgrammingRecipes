package DesignPatterns.Structural.Flyweight;

import java.util.HashMap;

/**
 * Created by timmanas on 2017-04-09.
 */
public class ShapeFactory {

    // Stores Unique Objects only.
    private static final HashMap<String, Shape> map = new HashMap();

    public static Shape getCircle(String colour){

        Circle circle = (Circle) map.get(colour);

        // Checks if the object doesent exists and adds it to the Map.
        // Thus reduces memory footprint
        if(circle == null){
            circle = new Circle(colour);
            map.put(colour, circle);
            System.out.println("\nCreating circle of colour: " + colour );
        }

        return circle;
    }

}

