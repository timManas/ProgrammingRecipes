package DataStructures.Heaps.BinaryHeap;

import java.util.Arrays;

/**
 * Created by timmanas on 2017-04-14.
 */
public class Main {

    public static void main(String [] args){

        Heap<String> heap = new Heap<>();
        heap.insert("T");
        heap.insert("i");
        heap.insert("m");
        heap.insert("o");
        heap.insert("t");
        heap.insert("h");
        heap.insert("y");

        System.out.println(heap);
        heap.deleteMin();
        System.out.println(heap);


        Heap<Integer> intHeap = new Heap<>();
        Integer[] a = {3,6,7,2,6,7,2,1,8,5,9};
        intHeap.heapSort(a);
        System.out.println(Arrays.toString(a));

    }
}


