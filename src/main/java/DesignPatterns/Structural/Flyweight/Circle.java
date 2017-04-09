package DesignPatterns.Structural.Flyweight;

/**
 * Created by timmanas on 2017-04-09.
 */
public class Circle implements Shape {

    private int x;
    private int y;
    private int radius;
    private String colour;

    public Circle(String colour){
        this.colour = colour;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + colour + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
