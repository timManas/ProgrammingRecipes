package Heaps.BinaryHeap_VisualAlgo;

/**
 * Created by timmanas on 2017-07-22.
 */
public class BinaryHeapMain {

    //region Constants
    private static BinaryHeap heap;
    //endregion

    //region Main
    public static void main(String [] args) {

        int [] input = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        // Create O(N Log N)
        createHeap_NLogN(input);

//        // Create O(Log N)
//        createHeap_LogN(input);

        heap.printBinaryHeap();
        
        // Insert
        insertHeap(100);

        heap.printBinaryHeap();

        // Extract Max
        extractMax();

        // Heap Sort - To Sort the heap, we simply call ExtractMax until there is no Elements left =)
        sort(); //

    }

    //endregion

    //region Helpers
    private static void createHeap_NLogN(int[] input) {
        heap = new BinaryHeap(BinaryHeap.RUNTIME_NLogN, input);
    }

    private static void createHeap_LogN(int[] input) {
        heap = new BinaryHeap(BinaryHeap.RUNTIME_N, input);
    }

    private static void insertHeap(int element) {
        if(heap.getObjList().size() <= 0) {
            int [] array = {element};
            heap = new BinaryHeap(BinaryHeap.RUNTIME_NLogN, array);
        }

        heap.getObjList().add(element);
        heap.percolateUp(heap.getObjList().size() - 1);
    }

    private static void extractMax() {

    }

    private static void sort() {

    }

    //endregion

}

/**

 Binary Heap

 What ?
 - Binary Tree with Additional contraints
    - Each layer with the exception of the root layer should have max two children
    - Each Layer should be greater than child layers



 Notes
 - Generally implemented as an Array
    - Root Element = a[0]
    - Left Node = a[(2i) + 1]
    - Right Node = a[(2i) + 2]

 Applicaions of Heaps
 - Heap Sort: Sort an array in N(LogN) time
 - Priority Queues: Can be implemented in BH since it can insert, delete, extract info
 - Graph Algorithms: BH is used for  Dijkstra’s Shortest Path and Prim’s Minimum Spanning Tree.


 Reference



 */
