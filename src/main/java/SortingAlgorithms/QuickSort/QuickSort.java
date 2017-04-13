package SortingAlgorithms.QuickSort;

/**
 * Created by timmanas on 2017-04-12.
 */
public class QuickSort {

    private int[] array;
    private int length;

    public static void main(String [] args){
        System.out.println("::: Quick Sort Algorithm :::");

        int [] input = {24,2,45,20,56,75,2,56,99,53,12};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(input);

        for(int i : input)
            System.out.print(i + " ");

    }


    private void sort(int[] inputArray){

        if(inputArray == null || inputArray.length == 0)
            return;

        this.array = inputArray;
        length = inputArray.length;
        quickSort(0, this.length - 1);

    }

    private void quickSort(int lowerIndex, int higherIndex){

        int i = lowerIndex;
        int j = higherIndex;

        // Calculating the Pivot
        int pivot = array[lowerIndex + (higherIndex - lowerIndex)/2];

        /*
            Divides the array into two
            For every iteration, we search for numbers from the left side which are
            greater than pivot value. Then we search for numbers which are smaller than
            the pivot value. Then we exchange the numbers
        */
        while(i <= j){

            while (array[i] < pivot)
                i++;

            while (array[j] > pivot)
                j--;

            if(i <= j){
                exchangeNumbers(i,j);
                i++;
                j--;
            }
        }

        if(lowerIndex < j)
            quickSort(lowerIndex, j);

        if(i < higherIndex)
            quickSort(i, higherIndex);


    }

    private void exchangeNumbers(int low, int high){

        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;

    }
}


/**

 Quick Sort Algorithm

 What ?
 - Uses Divide & Conquer
 - Sorts list into two smaller sublist: Low Elements & High Elements
 - Uses Recursion to sort sublist

 Algorithm

 Notes

 Reference
 http://www.java2novice.com/java-sorting-algorithms/quick-sort/

 */