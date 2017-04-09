package DesignPatterns.Creational.Prototype;

/**
 * Created by timmanas on 2017-04-08.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}
