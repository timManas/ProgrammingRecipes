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
