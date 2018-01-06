package Misc.VariableArguments;

/**
 * Created by timmanas on 2018-01-06.
 */
public class VarArgsExample {

    //region Member

    //endregion

    //region Main
    public static void main(String [] args) {

        printNumber(100);
        printNumber(1,2,3);
        printNumber(3,6,8,3,7,2,8,2);
    }


    //endregion

    //region Helper
    private static void printNumber(int ... number) {

        System.out.println("The Total Number of Arguments: " + number.length);

        for(int i : number) {
            System.out.println("i: " + i);
        }

        System.out.println(" ============ ");
    }
    //endregion


}


/**

 VarArgs

 What ?
 - Method which can take in ANY amount of inputs.
 - All you need is replace the input parameter with "..." followed by the parameter name (ex. "int ... number")
 - What this means that, any sized input can be placed


 Note
 - The number of inputs gets put in an array. Just FYI
 - VarArgs methods can be overloaded, but overloading may led to ambiguity
 - There can ONLY be ONE variable argument in a method, otherwise Compilation Error occurs
 - Theres can ONLY BE ONE argument. Period.



 */