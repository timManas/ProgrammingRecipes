package DesignPatterns.Creational.AbstractFactory;



/**
 * Created by timmanas on 2017-04-08.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {

        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();

        }else if(shapeType.equalsIgnoreCase("Square")){
            return new Square();

        }else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();

        }

        return null;

    }

    @Override
    public Colour getColour(String colourType) {
        return null;
    }

}
