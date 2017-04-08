package DesignPatterns.Bridge;

/**
 * Created by timmanas on 2017-04-08.
 */
public class RedCircle implements DrawAPI {

    public void drawCircle(int radius) {
        System.out.println("Radius of the Red Circle: " + radius);
    }
}
