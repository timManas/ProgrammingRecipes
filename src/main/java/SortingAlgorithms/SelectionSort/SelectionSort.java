package SortingAlgorithms.SelectionSort;

/**
 * Created by timmanas on 2017-06-30.
 */
public class SelectionSort {

    //region Constants

    //endregion

    //region Main
    public static void main (String [] args) {

        int [] input = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        int [] output = selectionSort(input);

        printSortedArray(output);
    }
    //endregion

    //region Helpers
    private static int[] selectionSort(int[] input) {

        int currentMinimumIndex = 0;        // We care MORE about the index
        int orderedIndex = 0;
        int comparatorIndex;

        do {
            currentMinimumIndex = orderedIndex;

            for(comparatorIndex = orderedIndex; comparatorIndex < input.length; comparatorIndex++) {
                if(input[currentMinimumIndex] > input[comparatorIndex])
                    currentMinimumIndex = comparatorIndex;
            }

            swap(orderedIndex, currentMinimumIndex, input);
            orderedIndex++;

        } while (orderedIndex != input.length);

        return input;
    }

    private static void swap(int orderedIndex, int currentMinimumIndex, int[] input) {
        int temp = input[orderedIndex];
        input[orderedIndex] = input[currentMinimumIndex];
        input[currentMinimumIndex] = temp;
    }




    private static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println("Index #" + i + ": " + array[i]);
    }


    //endregion

}
