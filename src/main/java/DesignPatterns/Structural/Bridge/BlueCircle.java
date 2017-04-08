package DesignPatterns.Structural.Bridge;

/**
 * Created by timmanas on 2017-04-08.
 */
public class BlueCircle implements DrawAPI {

    public void drawCircle(int radius) {
        System.out.println("Radius of the Blue Circle: " + radius);
    }
}
