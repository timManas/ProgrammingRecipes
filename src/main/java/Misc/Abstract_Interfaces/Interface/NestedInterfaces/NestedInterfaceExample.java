package Misc.Abstract_Interfaces.Interface.NestedInterfaces;

/**
 * Created by timmanas on 2017-08-21.
 */
public class NestedInterfaceExample {

    //region Members

    //endregion

    //region Main
    public static void main (String [] args) {

        SubClass subClassObject = new SubClass();

        // Example #1: Interface within a class
        System.out.println("========= Interface Within a Class ========= ");
        subClassObject.showPublic();
        subClassObject.printPublic();

        System.out.println("\n========= Now this gets Interesting ========= ");

        // Example #2: Interface inside a Abstract Class
        Base.InnerPublicInterface testObject = subClassObject;
        testObject.showPublic();                                          // Remember testObject is JUST a reference
        testObject.printPublic();                                         // subClassObject is the REAL Object

        Base.InnerProtectedInterface testObjectII = subClassObject;
        testObjectII.showProtected();
        testObjectII.printProtected();


        // Interface in another Interface
        System.out.println("\n ========= Interface Within another Interface ========= ");
        subClassObject.showSubInterface();
        subClassObject.printSubInterface();


    }
    //endregion

}

/**
    Nested Interfaces

    What ?
    - Interfaces can be placed within classes or within other interfaces
    - Subclass can implement an inner or outer interface using the "." (dot) keyword
    - If interface is used, Still need to implement all methods declared in interface

    Why ?
    - TBH I dont know why you would want this, it makes things very messy =/

    Notes
    - The left hand (before the "=") is ONLY the reference, the right hand refers to the ACTUAL Object
    - Remember interfaces can only be PUBLIC


 */
