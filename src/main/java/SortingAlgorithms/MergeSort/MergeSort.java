package SortingAlgorithms.MergeSort;

/**
 * Created by timmanas on 2017-07-01.
 */
public class MergeSort {

    //region Constant

    //endregion

    //region Main
    public static void main (String [] args) {
        int [] input = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int [] array = mergeSort(input, 0, input.length - 1);
        printSortedArray(array);
    }
    //endregion

    //region Helpers

    private static int[] mergeSort(int[] input, int startIndex, int endIndex) {

        int mid = input.length / 2;

        // Divide Left Half
        mergeSort(input, 0, mid);

        // Divide Right Half
        mergeSort(input,mid + 1, endIndex);

        // Merge
        merge();

        return input;
    }



    private static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println("Index #" + i + ": " + array[i]);
    }
    //endregion

}


/**

 Merge Sort Algorithm

 What ?
 - Divide & Conquer
 - Run Time - O(N Log N)
 - Faster than most algorithm but uses alot more memory O(N)
 - Uses Recursion !!!! Not hard coded

 Reference
 - https://visualgo.net/en/sorting

 */