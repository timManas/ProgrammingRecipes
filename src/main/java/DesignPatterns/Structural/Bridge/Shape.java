package DesignPatterns.Structural.Bridge;

/**
 * Created by timmanas on 2017-04-08.
 */
public abstract class Shape {

    private DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public void draw(){

    }

    public DrawAPI getDrawAPI() {
        return drawAPI;
    }

}
