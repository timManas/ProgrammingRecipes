package Misc.BufferedReader;

import DesignPatterns.Behavioural.Interpreter.Expression;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by timmanas on 2017-04-15.
 */
public class BufferedReaderDemo {

    public static void main(String [] args) {

        System.out.println("::: Buffered Reader Demo :::");

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = scn.nextInt();
        System.out.println("Enter a String");
        String b = scn.nextLine();
        System.out.printf("You have entered:- " + a + " " + "and name as " + b);



        // Buffered Reader

        try{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nEnter an integer");
            a = Integer.parseInt(br.readLine());
            System.out.println("Enter a String");
            b = br.readLine();
            System.out.printf("You have entered:- " + a + " and name as " + b);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


/**

 Notes

 - Use Buffered Reader when reading files
 - BFR is synchronous while Scanner is not
 - BFR works for multiple threads while Scanner does not
 - BFR is faster than Scanner since Scanner parses input data while BFR just reads the data

 */