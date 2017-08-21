package Misc.Abstract_Interfaces.NestedClasses;

/**
 * Created by timmanas on 2017-08-21.
 */
public class OuterClass {

    //region Members
    public static String type = "OuterClassType";
    public String outerType = "OuterClass";

    //endregion

    //region Helper
    public void display () {
        System.out.println("Displaying Outer Class");
    }
    //endregion

    //region Classes
    public static class InnerStaticClass {

        private String type = "InnerStaticClass";

        public void displayInnerStaticClass() {
            System.out.println("Displaying Class of type:  " + type);
        }

        public void displayOuterClass() {
            System.out.println("Displaying Outer Class Static Member:  " + OuterClass.type);    // You can still refer to the OuterClass members via Static keyword
        }
    }



    public class InnerNestedClass {

        private String type = "InnerClass";

        public void displayInnerClass() {
            System.out.println("Displaying  Class of type:  " + type);
        }

        public void displayOuterClass() {
            System.out.println("Displaying Outer Class Static Member:  " + outerType);    // Has access to Outer class members
        }

    }

    //endregion

}
