package Misc.PassingArgumentsToMain;

/**
 * Created by timmanas on 2019-01-08.
 */
public class PassingArgumentsToMain {


    public static void main(String [] args) {

        for (int i = 0; i < args.length; i++)
            System.out.println("Argument: " + args[i]);

    }

}


/**

 How to execute

 1. Open Run configurations
 2. Pass these values in Program Arguments: "Hello World" "Tim Manas"  "Carmen San Diego" (Copy this line)

 Why ?
 - When we convert this application to a jar file, we need to invoke this file
 - We can pass arguments (i.e Config files) to be read by the application
 - We can pass an infinite # of arguments which are seperated by spaces .. Note: Use "" if there are spaces if the argument contains spaces
 


 */