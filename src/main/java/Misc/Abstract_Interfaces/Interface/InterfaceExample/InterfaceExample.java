package Misc.Abstract_Interfaces.Interface.InterfaceExample;

/**
 * Created by timmanas on 2017-08-17.
 */
public class InterfaceExample {

    public static void main (String [] args) {

        Bicycle bicycle = new Bicycle();
        Motorcycle motorcycle = new Motorcycle();

        bicycle.setLicensePlate("BLBR bicycle");
        motorcycle.setLicensePlate("BLBR Motorcycle");

        for(int i = 0; i < 5; i++) {
            bicycle.changeGear();
            bicycle.speedUp();

            motorcycle.changeGear();
            motorcycle.speedUp();

            System.out.println("Motorycle Speed: " + motorcycle.getSpeed() + "      Gear: " + motorcycle.getGear());
            System.out.println("Bicycle Speed: " + bicycle.getSpeed() + "      Gear: " + bicycle.getGear());

            System.out.println("======");
        }

        System.out.println("Applying Brakes");
        motorcycle.applyBrakes();
        bicycle.applyBrakes();
        System.out.println("Motorycle Speed: " + motorcycle.getSpeed() + "      Gear: " + motorcycle.getGear());
        System.out.println("Bicycle Speed: " + bicycle.getSpeed() + "      Gear: " + bicycle.getGear());
        System.out.println("======");

        //REMEMBER ....VARIABLES IN INTERFACES ARE FINAL, PUBLIC AND ....STATIC
        System.out.println("License Plate of Vehicle: " + Vehicle.licensePlate);
        System.out.println("License Plate of Motorcycle: " + motorcycle.getLicensePlate());
        System.out.println("License Plate of Bicycle: " + bicycle.getLicensePlate());


        // Testing Default implementation in Interfaces
        motorcycle.displayDefaultLicenseplate();
        bicycle.displayDefaultLicenseplate();


        // Testing Static Method in Interfaces
        System.out.println("Model type of Vehicle: " + Vehicle.displayStaticModel());

    }

}

/**

 Interfaces

 What ?
 - Can have methods and variables
 - Methods are by default abstract .. i.e Only method signature, no body

 Why ?
 - Allows total abstraction
 - Allows loose coupling
 - Classes can inherit multiple interfaces but can extend only one abstract class

 New Features Addded for Java 1.8
 - We can have DEFAULT implementation of methods in Java 1.8+
 - Can now define static methods in interfaces

 Notes
 - Specifies what a class MUST do, not How
 - If class cannot provide bodies to method signatures, then the class MUST be declared abstract
 - Variables in interfaces are final, public and static
 - Methods in Interfaces are implicily defined as Abstract unless it is defined as Default or Static.
 - Interface can be inside  other interfaces or classes ...this is called "Nested interfaces"


 References


 */
