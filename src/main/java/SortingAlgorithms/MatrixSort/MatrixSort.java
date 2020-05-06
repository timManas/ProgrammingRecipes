package SortingAlgorithms.MatrixSort;

import java.util.Arrays;
import java.util.Comparator;

public class MatrixSort {

    public static void main(String [] args) {

        int [][] array = {{5,6},{7,7},{2,1},{0,7},{1,6},{5,1},{3,7},{0,3},{4,0},{1,2},{6,3},{5,0},{0,4},{2,2},{1,1},{6,4},{5,4},{0,0},{2,6},{4,5},{5,2},{1,4},{7,5},{2,3},{0,5},{4,2},{1,0},{2,7},{0,1},{4,6},{6,1},{0,6},{4,3},{1,7}};


        // Sort Array
        // This is how we fucking Sort a two dimensional Array
        // First, sort by Column
        // Second, Sort by Row

        // Sort by Columnm, starting from the last
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        // Sort Again but focus on 1st Column
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });


        // Print out Sorted Array
        for (int i=0; i < array.length; i++) {
            for (int j=0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

}
