package Misc.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by timmanas on 2017-10-15.
 */
public class BigIntegerExample {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        BigInteger bigInteger1 = scanner.nextBigInteger();
        BigInteger bigInteger2 = scanner.nextBigInteger();

        // Inputs
        System.out.println("bigInteger1: " + bigInteger1 + "      bigInteger2: " + bigInteger2);

        // Add two BigNumbers
        System.out.println("Add: " + bigInteger1.add(bigInteger2));

        // Substract two BigNumber
        System.out.println("Subtract: " + bigInteger1.subtract(bigInteger2));

        // Multiply two BigNumbers
        System.out.println("Multiply: " + bigInteger1.multiply(bigInteger2));

        // Divide two BigNumbers
        System.out.println("Divide: " + bigInteger1.divide(bigInteger2));

        // Moduglus to BigNumber
        System.out.println("Modulus: " + bigInteger1.mod(bigInteger2));

        // Convert Big Number to Double
        System.out.println("Convert to Double: " + bigInteger1.doubleValue());

        // Convert Big Number to Float
        System.out.println("Convert to Float: " + bigInteger1.floatValue());

        // to String
        System.out.println("Convert to String: " + bigInteger1.toString());

        // Is Equal ?
        System.out.println("Equal: BigInteger1 == BigInteger2 ?  " + bigInteger1.equals(bigInteger2));

        
    }


}
