package DataStructures.Graphs.TreeTraversalExample;

public class Test {

    /*
        Given an array, write a function to print out the integers that can be divided by 3 and 5
    */
    public static void main(String args [] ) {
        int input1 = 3;
        int input2 = 5;
        int [] arr = {};

        findIntegersDivideby(arr, input1, input2);
    }

    private static void findIntegersDivideby(int[] arr, int input1, int input2) {

        if ( arr == null) {
            return;
        }

        for (int i =0; i < arr.length; i++ ) {

            if (arr[i] % input1 == 0 && arr[i] % input2 == 0) {
                System.out.println("Divisible: " + arr[i]);
            }
        }
    }
}

/**
 1. Test if the arrays null
 2. If they are not null, test if we test
 */