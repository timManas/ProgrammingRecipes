package DesignPatterns.Creational.Prototype;

/**
 * Created by timmanas on 2017-04-08.
 */
public class PrototypeDesignPattern {

    public static void main(String[] args){
        System.out.println("::: Prototype Design Pattern");

        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("001");
        clonedShape1.draw();
        System.out.println("Shape: " + clonedShape1.getType());

        Shape clonedShape2 = ShapeCache.getShape("002");
        clonedShape2.draw();
        System.out.println("Shape: " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("003");
        clonedShape3.draw();
        System.out.println("Shape: " + clonedShape3.getType());

    }
}

/**

 Prototype Design Pattern  .... i.e  "Attack of the Clones" Design Pattern

 What ?
 - Creational
 - Instead of creating a "new" object, we create a duplicate object

 Why ?
 - Increased performance since we are not creating "new" objects (Expensive to create new object)
 - More better to create a copy an existing object instead of creating a new object

 When ?
 - When we need to duplicate an existing object

 Notes
 - Notice the "Clone" method used to create a duplicate object
 - Prototype only requires an object to duplicate, not a class unlike other creational patterns

 */
