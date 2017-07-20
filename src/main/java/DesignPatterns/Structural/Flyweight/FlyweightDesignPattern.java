package DesignPatterns.Structural.Flyweight;

/**
 * Created by timmanas on 2017-04-09.
 */
public class FlyweightDesignPattern {

    private static final String colors[] = {"Red", "Green", "Blue", "Pink", "Black", "Gold"};

    public static void main(String[] args){
        System.out.println("::: Flyweight Design Pattern :::");

        for(int i = 0 ; i < 20; i++){
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColour());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
        }

    }

    private static String getRandomColour(){
        return colors[(int)(Math.random()*colors.length)];

    }

    private static int getRandomX(){
        return (int)(Math.random()*100);
    }

    private static int getRandomY(){
        return (int)(Math.random()*100);
    }


}

/**

 Flyweight Design Pattern ... i.e Security @ Private Party / "Are you on the guestlist ? No duplicates allowed"

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
