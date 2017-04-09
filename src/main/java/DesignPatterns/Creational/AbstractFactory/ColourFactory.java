package DesignPatterns.Creational.AbstractFactory;



/**
 * Created by timmanas on 2017-04-08.
 */
public class ColourFactory extends AbstractFactory {

    @Override
    public Shape getShape(String circle) {
        return null;
    }

    @Override
    public Colour getColour(String colourType) {

        if(colourType.equalsIgnoreCase("Red")){
            return new Red();

        }else if(colourType.equalsIgnoreCase("Blue")){
            return new Blue();

        }else if(colourType.equalsIgnoreCase("Green")){
            return new Green();

        }


        return null;
    }

}
