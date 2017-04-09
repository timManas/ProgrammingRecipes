package DesignPatterns.Creational.Prototype;

/**
 * Created by timmanas on 2017-04-08.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
