package DataStructures.Lambda;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

interface ExternalInterface {
    int add(int a, int b);
}

public class LambdaExample {

    public interface Function1 {
        int operation(int a, int b);
    }

    public interface Function2 {
        void sayMessage(String message);
    }

    private int operate(int a, int b, Function1 funObj) {
        return funObj.operation(a, b);
    }

    public static void main(String args []) {

        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }




    private static void ex1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Ex1- Print out using one liner
        System.out.println("Ex1: One Line");
        list.forEach((number) -> System.out.println("Element: " + number));

        // Ex2- Print out using code block
        System.out.println("\nEx1b: Block Print");
        list.forEach((number) -> {
            int numberDouble = number * number;
            System.out.println("Element: " + numberDouble);
        });
    }

    private static void ex2() {
        System.out.println("\nEx2: Use Functional Interfaces with lambda functions");

        // Define the interface Behaviour here
        Function1 add = (x,y) -> (x + y);
        Function1 subtract = (x,y) -> (x - y);
        Function1 multiply = (x,y) -> (x * y);
        Function1 divide = (x,y) -> (x / y);
        Function1 doubleValues = (x,y) -> {
            System.out.println("Doubling Values");
            x = x * 2;
            y = y * 2;
            return (x + y);
        };

        LambdaExample example  = new LambdaExample();
        System.out.println("4 + 3 = " + example.operate(4,3, add));
        System.out.println("5 - 2 = " + example.operate(5, 2, subtract));
        System.out.println("10 - 4 = " + example.operate(10, 4, multiply));
        System.out.println("15 / 5 = " + example.operate(15, 5, divide));
        System.out.println("Double Values of 2 & 3 = " + example.operate(2, 3, doubleValues));
    }


    private static void ex3() {
        System.out.println("\nEx3: Use Functional Interfaces with lambda functions");

        ExternalInterface ei = (a,b) -> a + b; // Define the interface Behaviour here
        int total = ei.add(5,4);
        System.out.println("Total: " + total);
    }

    private static void ex4() {
        System.out.println("\nEx4: Use Lambda function to interate through a map");
        Map<String, Integer> map = new LinkedHashMap();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // Traverse through map
        map.forEach((key, value) -> {
            int doubleValue = value * value;
            System.out.println("Key: " + key + "    Value: " + doubleValue);
        });
    }

    private static void ex5() {
        System.out.println("\nEx5: Modify values inside lambda function");
        System.out.println("Note: This will cause an error. Value inside lambda need to be final");
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        int total = 0;
        map.forEach((key, value) -> {
            // total = total + value;       // This will cause a compilation error
        });
    }
}


/**

 Lambda

 What ?
 - Lambda functions are instances of functional interfaces (INterface with a single abstract method)
 - Lamba expressions implement the only abstract function and therefore implement the functional interface
 - Short block of code which takes in parameters and returns a value
 - Similar to menthods and they do not need a name
 - Syntax:
    (parameter1, parameter2) -> (expression)
        OR (if expresssion is complication. You can surround with {}
    (parameter1, parameter2)  -> { code block}

 Why ?
 - Honestly ...syntatic sugar. LOL


 Notes
 - Expression are limited.
 - Need to automatically return a value, cannot contain variables, assignments or if/else statements.etc
 - You cannot modify OUTSIDE variables from within the lamba function
    > Variables inside lambda functions are treated as final

 Best Practices
 - Keep Lambda Expressions Short and Self-explanatory
 - Avoid Blocks of Code in Lambda's Body
 - Avoid Specifying Parameter Types
 - Avoid Return Statement and Braces

 */

