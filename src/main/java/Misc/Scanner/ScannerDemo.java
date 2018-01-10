package Misc.Scanner;

import java.util.Scanner;

/**
 * Created by timmanas on 2017-04-15.
 */
public class ScannerDemo {

    public static void main(String [] args) {


        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Name: " + name);

        char gender = scanner.next().charAt(0);
        System.out.println("Gender: " + gender);

        int age = scanner.nextInt();
        System.out.println("Age: " + age);

        long mobileNumber = scanner.nextLong();
        System.out.println("Mobile Number: " + mobileNumber);

    }
}


/**

 Scanner


 What ?
 - A Class in the util package which is used to obtaining primitive types like int, double, etc.
 - To read Strings, we use "nextLine()"
 - To read Chars, we use "next.charAt(i)"

 Notes
 - "System.in" ask Input from the user
 - If the input does not match the type requested, an error will be produced ...DUH
 - We can have multiple types to fetch

 
 */