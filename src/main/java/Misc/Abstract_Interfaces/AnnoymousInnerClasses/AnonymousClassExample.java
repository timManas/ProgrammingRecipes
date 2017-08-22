package Misc.Abstract_Interfaces.AnnoymousInnerClasses;

/**
 * Created by timmanas on 2017-08-22.
 */
public class AnonymousClassExample {

    //region Members
    public String ID = "123456";
    //endregion

    //region Main
    public static void main (String [] args) {

        String ID_inner = "123456";

        AnonymousInterface object1 = new AnonymousInterface() {
            @Override
            public void show() {
                System.out.println("Type is: " + type);
//                System.out.println("ID is: " + ID);         // Does not work since, Anon classes cannot fetch members outside it's block
                System.out.println("ID is: " + ID_inner);
            }
        };

        object1.show();

    }

    //endregion
}


/**
 Anonymous Inner Classes

 What ?
 - Inner Class which has no name
 - Only one object is created
 - Can be created by: - Class ( abstract or concrete)
                      - Interface


 Why ?
 - Useful when creating an object with "Extra" Features without having to subclass a class

 Notes
 - Anon classes can access members in the same enclosed block
 - Anon classes can access members in the original class/interface
 - You can declare Fields, method, instance initializers, local class
 - Cannot declare constructors


 References
 http://www.geeksforgeeks.org/anonymous-inner-class-java/

 */
