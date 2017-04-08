package DesignPatterns.Creational.Factory;

/**
 * Created by timmanas on 2017-04-08.
 */
public class ShapeFactory {

    public Shape getShape(String type){

        switch (type){
            case "Circle":{
                return new Circle();
            }

            case "Square":{
                return new Square();
            }

            case "Rectangle":{
                return new Rectangle();
            }
        }

        return null;
    }
}
