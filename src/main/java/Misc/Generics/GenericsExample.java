package Misc.Generics;

import java.lang.reflect.Array;

/**
 * Created by timmanas on 2017-08-12.
 */
public class GenericsExample {

    //region Members
    static Integer[] intArray = { 1, 2, 3, 4, 5 };
    static Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
    static Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
    //endregion

    //region Main
    public static void main (String [] args) {

        // Generic Method Example
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);

        // Generic Bounded Type Example
        System.out.println("LastElement of Int Array: " + printLastElement(intArray));
        System.out.println("LastElement of Double Array: " + printLastElement(doubleArray));
        System.out.println("LastElement of Char Array: " + printLastElement(charArray));
        System.out.println("========");

        // Generic Class Example
        GenericClass<Integer> integerGenericClass = new GenericClass<>();
        GenericClass<Double> doubleGenericClass = new GenericClass<>();
        GenericClass<Character> characterGenericClass = new GenericClass<>();

        integerGenericClass.add(10);
        doubleGenericClass.add(12.5);
        characterGenericClass.add('X');

        System.out.println("IntegerGenericClass: " + integerGenericClass.getElement());
        System.out.println("DoubleGenericClass: " + doubleGenericClass.getElement());
        System.out.println("CharGenericClass: " + characterGenericClass.getElement());

    }

    //endregion

    //region Helpers
    private static <T> void printArray(T[] inputArray) {
        System.out.println("=====");
        for(T element : inputArray)
            System.out.println("Element: " + element);
        System.out.println("=====");
    }

    private static <T extends Comparable <T>> T printLastElement(T[] inputArray) {

        T max = inputArray[inputArray.length - 1];
        return max;
    }

    //endregion


    /**
        Generics

        What ?
        - Allows developers to specify a set of related methods using a SINGLE methods declaration
        - Can be applied to both methods & classes
        - Ensures "Type Safe" and catches any invalid type at Compile time


        Why ?
        - Can specify exactly what type we need

        Notes
        - Bounded Type Parameters Generics - You want to restrict the type of object as input parameters
        - You could also have Generic Classes
            - Notice you have to directly specify the type of elements received in Generic Classes

        References
        - https://www.tutorialspoint.com/java/java_generics.htm


     */

}
