package DesignPatterns.Creational.Prototype;

import java.util.HashMap;

/**
 * Created by timmanas on 2017-04-08.
 */
public class ShapeCache {

    private static HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();

    public static Shape getShape(String id){
        Shape cachedShape = shapeMap.get(id);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("001");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("002");
        shapeMap.put(square.getId(), square);

        Rectangle rect = new Rectangle();
        rect.setId("003");
        shapeMap.put(rect.getId(), rect);

    }

}
