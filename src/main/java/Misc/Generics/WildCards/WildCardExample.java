package Misc.Generics.WildCards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by timmanas on 2017-08-13.
 */
public class WildCardExample {

    //region Members
    static List<Integer> intArray = Arrays.asList(1, 2, 3, 4, 5);
    static List<Double>  doubleArray = Arrays.asList(1.1, 2.2, 3.3, 4.4);
    //endregion

    //region Main
    public static void main (String [] args) {

        // Upper Bounded Wildcard
        System.out.println("Total sum(int): " + sum(intArray));
        System.out.println("Total sum(double): " + sum(doubleArray));

        // Lower Bounded Wildcard
        List<Number>  numberArray = new ArrayList<>();
        numberArray.add(10);
        numberArray.add(20);
        numberArray.add(30);
        System.out.println("Printing IntArray: " + printList(intArray));
        System.out.println("Printing IntArray: " + printList(numberArray));

        // Unbounded Wildcard
        printList_Unbounded(intArray);
        printList_Unbounded(doubleArray);

    }

    //endregion

    //region Helpers

    // This is Upper Bounded Wildcard
    private static double sum(List<? extends  Number> inputList) {

        double sum = 0;
        for(Number number : inputList) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // This is the Lower Bound Wildcard
    private static List<? super Integer> printList(List<? super  Integer> inputList) {
        return inputList;
    }

    // This is the unbounded Wildcard
    private static void printList_Unbounded(List<?> inputArray) {
        System.out.println(inputArray);
        System.out.println("=======");
    }


    //endregion

    /**

     WildCards

     What ?
     - The question mark "?" in Generic is known as a wild card
     - Represents an unknown type
     - Refers to the type of parameter, field or return type
     - There are 3 different types of Wild cards


     1. Upper Bound Wildcards (UBW)
        - Syntax: public static void add (List <? extends Number> list)
        - Used to relax the restriction on a variable.... ex List<Integer>, List<doulbe>

     2. Lower Bound Wildcards
        - Syntax: CollectionType < ? super A>
        - The "super" keyword means the arguments can either be Integer or superclass of Integer which is "Number"
        - The method will only take in Integer or it's Superclass Objects.
        - If we pass in Double, we will get Compilation Error

     3. Unbounded Wildcards
        - Syntax: Just use "?" wildcard
        - EX. for list use List<?>, which refers to a unbounded wildcard


     Why ?
     - Honestly, its just a shortcut
     - Instead of creating alot of methods doing the exact same thing with different object types

     Notes
     - Use "extend" wildcard when you want to GET values out of structure
     - Use "super" wildcard when you want to PUT values in a structure
     - DO NOT USE WILDCARD if you want to GET & PUT values in a structure

     Reference
     http://www.geeksforgeeks.org/wildcards-in-java/

     */

}
