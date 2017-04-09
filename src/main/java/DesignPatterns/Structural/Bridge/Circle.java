package DesignPatterns.Structural.Bridge;

/**
 * Created by timmanas on 2017-04-08.
 */
public class Circle extends Shape {

    private int x,y,radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw(){
        getDrawAPI().drawCircle(radius);
    }

}
