package Heaps.BinaryHeap_VisualAlgo;

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
        int root = objList.get(0);
        removeRoot();
        sortHeap();
        return root;
    }

    private int getLeftChild(int index) {
        return objList.get((2 * index) + 1);
    }

    private int getRightChild(int index) {
        return objList.get((2 * index) + 2);
    }

    private int getParent(int index) {
        return objList.get(getParentIndex(index));
    }

    public int getParentIndex(int index) {
        return (index - 1)/2;
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

    }

    private void swap(int parentIndex, int currentIndex) {
        int temp = objList.get(parentIndex);
        objList.set(parentIndex, objList.get(currentIndex));
        objList.set(currentIndex, temp);
    }

    private void sortHeap() {

    }


    protected void printBinaryHeap() {
        System.out.println("============");
        for(int i= 0; i < objList.size() ; i++)
            System.out.println("Index #" + i + ": " + objList.get(i));
    }

    //endregion
}
