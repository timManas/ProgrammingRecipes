package Misc.Abstract_Interfaces.NestedClasses;

/**
 * Created by timmanas on 2017-08-21.
 */
public class NestedClassesExample {

    public static void main (String [] args) {

        // Inner Static Class
        System.out.println("======= Inner Static Class =======");
        OuterClass.InnerStaticClass staticInnerClass = new OuterClass.InnerStaticClass();
        staticInnerClass.displayInnerStaticClass();
        staticInnerClass.displayOuterClass();


        System.out.println("======= Inner Class =======");
        // Nested Inner Class
//        OuterClass.InnerNestedClass innerNC_obj = new OuterClass.InnerNestedClass();  // This does not work since you first have to initialize the outer class then the inner class
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerNestedClass innerClass = outerClass.new InnerNestedClass();
        innerClass.displayInnerClass();
        innerClass.displayOuterClass();

    }
}

/**

 Nested Classes

 What ?
 - Class within a Class
 - Two types of nested Class: - Static Nested Classes
                              - Inner Nested Classes

 Why ?


 Static Nested Classes
 - Use keyword "static"
 - OuterClass members are not visible to static Nested class unless it has "static" keyword associated with it
 - You can instantiate Static Nested Class using "new" keyword like any other class.
 - BARELY USED ... since they do not have access to outer class members


 Inner Nested Classes
 - To instantiate an Inner class, you need to   1. Instantiate outer class first
                                                2. Instantiate inner class
 - Has access to Outerclass members  !!!



 Notes
 - Scope of NestedClass is only within the Enclosing Class ...thats it
 - Nested Classes have access to members within it's enclosing class
 - Nested Classes are also a member of it's Enclosing Class

 */
