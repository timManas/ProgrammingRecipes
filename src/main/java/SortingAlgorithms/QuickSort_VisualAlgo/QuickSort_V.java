package SortingAlgorithms.QuickSort_VisualAlgo;

import SortingAlgorithms.QuickSort.QuickSort;

/**
 * Created by timmanas on 2017-07-19.
 */
public class QuickSort_V {

    //region Constants

    //endregion

    //region Main
    public static void main(String [] args) {
        int [] input = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("========== UnSorted ==========" );
        printSortedArray(input);

        QuickSort(input, 0, input.length - 1);

        System.out.println("========== Final ==========" );
        printSortedArray(input);
    }
    //endreigon

    //region Helpers
    private static void QuickSort(int[] input, int startIndex, int endIndex) {

        if(startIndex >= endIndex)
            return;

        // Find the partition Index. So we have the left and the right Array
        int partitionIndex = partition(input, startIndex, endIndex);

        // Sort the Left. Remember we have the -1 because we want to stop before the actual Partiton Index
        QuickSort(input, startIndex, partitionIndex - 1);

        // Sort the Right. We dont start from the partition index
        QuickSort(input, partitionIndex + 1, endIndex);
    }

    private static int partition(int[] input, int startIndex, int endIndex) {

        // Start with the first Index ...which is startIndex.
        // But we can also start from the end.
        int pivot = input[startIndex];
        int currentIndex = startIndex;             // currentIndex

        // The reason we start from +1 is because startIndex by itself is the Pivot.
        // Explores the unknown region
        for(int i = startIndex + 1; i <= endIndex; i++) {
            if(input[i] < pivot) {
                currentIndex++;
                swap(input, i, currentIndex);
            }
        }
        swap(input, startIndex, currentIndex);
        printSortedArray(input);

        return currentIndex; // Returning the index of the current pivot
    }

    private static void swap(int[] input, int currentIndex, int startIndex) {
        int temp = input[currentIndex];
        input[currentIndex] = input[startIndex];
        input[startIndex] = temp;
    }

    private static void printSortedArray(int[] array) {
        System.out.println("\n ==========\n" );
        for (int i = 0; i < array.length; i++)
            System.out.println("Index #" + i + ": " + array[i]);
    }
    //endregion

}



/**

 Quick Sort Algorithm

 What ?
 - Divide & Conquer
 - Run Time - O(N Log N)
 - Requires a Partition
    - You can pick a pivot from start, end, random or median

 What is the partition ?
 - Given x in an array, determine where to put x.
    - If the x is smaller than the pivot, then it is put on the left
    - If the x is larger than the pivot, then it is put on the right


 Notes
 - Similar to Merge Sort since it requires to sort the left and the right side
 - Different from Merge Sort since it requires a partition to determine the correct pivot


 Reference
 - https://visualgo.net/en/sorting

 */