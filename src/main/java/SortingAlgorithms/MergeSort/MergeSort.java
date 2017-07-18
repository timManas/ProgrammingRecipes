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
        mergeSort(input, 0, input.length - 1);
        printSortedArray(input);
    }
    //endregion

    //region Helpers

    private static void mergeSort(int[] inputArray, int startIndex, int endIndex) {

        // We have to add the '=', otherwise we get an infinite loop
        if(startIndex >= endIndex)
            return;

        int midIndex = (endIndex + startIndex) / 2;

        // Divide Left Half
        mergeSort(inputArray, startIndex, midIndex);

        // Divide Right Half
        mergeSort(inputArray,midIndex + 1, endIndex);

        // Merge
        merge(inputArray, startIndex, midIndex, endIndex);

        // Solution from the VisualAlgo
//        if(startIndex < endIndex) {
//            int midIndex = (endIndex + startIndex) / 2;
//
//            // Divide Left Half
//            mergeSort(inputArray, startIndex, midIndex);
//
//            // Divide Right Half
//            mergeSort(inputArray,midIndex + 1, endIndex);
//
//            // Merge
//            merge(inputArray, startIndex, midIndex, endIndex);
//        }

    }

    private static void merge(int[] inputArray, int startIndex, int midIndex, int endIndex) {

        int numOfElements = endIndex - startIndex + 1;  // Get the number of Elements in which we are computing
        int[] tempArray = new int[numOfElements];       // Create new array to store sorted Elements
        int tempArrayIndex = 0;
        int left = startIndex;
        int right = midIndex + 1;

        System.out.println("==========" );

        while(left <= midIndex && right <= endIndex) {

            if(inputArray[left] <= inputArray[right]) {
                tempArray[tempArrayIndex] = inputArray[left];
                left++;
            } else {
                tempArray[tempArrayIndex] = inputArray[right];
                right++;
            }

            tempArrayIndex++;
            System.out.println("i: " + tempArrayIndex + ": " + inputArray[tempArrayIndex] );

            // This is a more Optimized Solution... but I like mine better =)
//            tempArray[tempArrayIndex++] = (inputArray[left] <= inputArray[right] ? inputArray[left++] : inputArray[right++]);
//            System.out.println("i: " + tempArrayIndex + ": " + inputArray[tempArrayIndex] );
        }

        // If there are any left overs, we add from the left Array
        while (left <= midIndex) {
            tempArray[tempArrayIndex++] = inputArray[left++];
        }

        // If there are any left overs, we add from the Right Array since greatest to smallest
        while (right <= endIndex) {
            tempArray[tempArrayIndex++] = inputArray[right++];
        }

        // Copy back array into Main Array. Notice we are constantly creating new array and copying back to the original ?
        for (int k = 0; k < numOfElements; k++) {
            inputArray[startIndex + k] = tempArray[k];
        }

    }

    private static void printSortedArray(int[] array) {
        System.out.println("==========\n" );
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
 - It sorts the left side to the right ....NOT my level mind you (visit VisualAlgo for visualization)

 Reference
 - https://visualgo.net/en/sorting

 */