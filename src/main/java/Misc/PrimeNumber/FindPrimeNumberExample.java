package Misc.PrimeNumber;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by timmanas on 2017-10-14.
 */
public class FindPrimeNumberExample {

    //region Main
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        // Print All Prime Numbers
        printPrimeNumbers(limit);


        // Check if the Number is a Prime #
        checkNumIsPrime(limit);

    }

    //endregion


    //region Utility
    private static void printPrimeNumbers(int limit) {

        System.out.println("============= Trivial Case =============");
        ArrayList<Integer> primeNumList = new ArrayList<>();

        for(int i = 2; i <= limit; i++) {                               // Goes through entire List

           boolean isPrime = false;

           for(int j = 2; j < i ; j++) {                                // Check if each number is divisible

               if(i % j == 0) {                 // If Divisble -> Break
                   isPrime = true;
                   break;
               }
           }

           if(!isPrime) {
               System.out.println(i);
               primeNumList.add(i);
           }
        }

    }

    /**
     * Just a couple things
     * 1. We check if the number is divisible by two ... why ? Because it can quickly determine if it is divisible or not
     * 2. We check the odd numbers up to the square of the limit.
     *
     * Why do we use the square root of n ?
     * If you list all the factors of a number, the square root will always be in the middle
     */

    private static void checkNumIsPrime(int limit) {

        System.out.println("============= Check if Number is Prime =============");

        // Check if limit is disible by 2
        if(limit % 2 == 0) {
            System.out.println("Not a Prime Number");
            return;
        }

        // Check odd numbers
        for(int i = 3; i * i <= limit; i += 2) {

            if(limit % i == 0) {
                System.out.println("Not a Prime Number");
                return;
            }
        }

        System.out.println("Number is Prime: " + limit);
    }

    //endregion

}
