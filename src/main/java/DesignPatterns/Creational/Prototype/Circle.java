package DesignPatterns.Creational.Prototype;

/**
 * Created by timmanas on 2017-04-08.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
