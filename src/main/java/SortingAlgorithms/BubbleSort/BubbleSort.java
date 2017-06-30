package SortingAlgorithms.BubbleSort;

/**
 * Created by timmanas on 2017-06-30.
 */
public class BubbleSort {

    public static void main (String [] args) {

        int [] input = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        int [] array = bubbleSort (input, "Desending");

        printSortedArray(array);


    }

    //region Helpers
    private static int[] bubbleSort(int[] input, String order) {


        int endIndex = input.length - 1;

        do {

            for(int i = 0; i < endIndex; i++) {

                int leftIndex = i;
                int rightIndex = leftIndex++;

                if (order.equalsIgnoreCase("Ascending")) {
                    if(input[leftIndex] < input[rightIndex]) {
                        input = swap(leftIndex, rightIndex, input);
                    }
                } else {
                    if(input[leftIndex] > input[rightIndex]) {
                        input = swap(leftIndex, rightIndex, input);
                    }
                }

            }

            endIndex--;
        } while (endIndex != 0);


        return input;
    }

    private static int[] swap(int leftIndex, int rightIndex, int[] input) {

        int temp = input[leftIndex];
        input[leftIndex] = input[rightIndex];
        input[rightIndex] = temp;

        return input;
    }

    private static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println("Index #" + i + ": " + array[i]);
    }
    //endregion
}
