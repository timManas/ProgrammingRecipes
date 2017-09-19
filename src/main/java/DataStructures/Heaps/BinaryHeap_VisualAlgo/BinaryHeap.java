package DataStructures.Heaps.BinaryHeap_VisualAlgo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timmanas on 2017-07-25.
 */
public class BinaryHeap {

    //region Members
    public static final String RUNTIME_NLogN = "O(NLogN)";
    public static final String RUNTIME_N = "O(N)";
    private List<Integer> objList;
    private int parentIndex;
    //endregion

    //region Constructor
    public BinaryHeap(String runtime, int[] input) {
        objList = new ArrayList<>();
        if(runtime.equalsIgnoreCase(RUNTIME_N)) {
            createOptBinHeap(input);
        } else {
            createBinHeap(input);
        }
    }

    //endregion

    //region Getter
    public List<Integer> getObjList() {
        return objList;
    }

    public int getMaxElement() {

        // Save the first Element
        int root = objList.get(0);

        // Swap the first & Last Element
        swap(0, objList.size() - 1);

        // Delete the Last Element
        objList.remove(objList.size() - 1);

        // Percolate down
        percolateDown(0);

        return root;
    }

    public int getParentIndex(int index) {
        return (index - 1)/2;
    }

    public int getLeftIndex(int parentIndex) {
        return (2 * parentIndex) + 1;
    }

    public int getRightIndex(int parentIndex) {
        return (2 * parentIndex) + 2;
    }

    //endregion

    //region Creators
    private void createOptBinHeap(int[] input) {

    }

    private void createBinHeap(int[] input) {
        for(int i = 0; i < input.length; i++){
            objList.add(input[i]);
            percolateUp(i);
        }

        System.out.println("Finished creating Binary heap. Total Size: " + objList.size());
    }
    //endregion

    //region Helpers
    public void makeEmpty() {
        objList.clear();
    }

    private void removeRoot() {

    }

    protected void percolateUp(int index) {

        while (index != 0) {

            int currentIndex = index;               // get current Index
            int parentIndex = getParentIndex(index);     // get Parent

            // if Parent is smaller ... switch
            if(objList.get(parentIndex) < objList.get(currentIndex))
                swap(parentIndex, currentIndex);

            index = parentIndex;
        }
    }

    private void percolateDown (int index) {

        int currentIndex = index; // Start at the Root
        int leftIndex = getLeftIndex(currentIndex);
        int rightIndex = getRightIndex(currentIndex);


        try {

            int maxElementIndex = leftIndex;
            if(objList.get(leftIndex) < objList.get(rightIndex)) {
                maxElementIndex = rightIndex;
            }

            if(objList.get(currentIndex) < objList.get(maxElementIndex)) {                     // Compare to the Left Child
                swap(currentIndex, maxElementIndex);
                percolateDown(maxElementIndex);
            }

        } catch (Exception e) {
           System.out.println("Reached Leaf.... Ending");
        }

    }

    private void swap(int parentIndex, int currentIndex) {
        int temp = objList.get(parentIndex);
        objList.set(parentIndex, objList.get(currentIndex));
        objList.set(currentIndex, temp);
    }

    protected void printBinaryHeap() {
        System.out.println("============");
        for(int i= 0; i < objList.size() ; i++)
            System.out.println("Index #" + i + ": " + objList.get(i));
    }

    //endregion
}
