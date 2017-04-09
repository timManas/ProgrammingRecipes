package DesignPatterns.Structural.Facade;

/**
 * Created by timmanas on 2017-04-09.
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle(){
        this.circle.draw();
    }

    public void drawRectangle(){
        this.rectangle.draw();
    }

    public void drawSquare(){
        this.square.draw();
    }

}
