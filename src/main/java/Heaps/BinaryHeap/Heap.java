package Heaps.BinaryHeap;

/**
 * Created by timmanas on 2017-04-14.
 */
public class Heap<AnyType extends Comparable<AnyType>> {

    //region Constants
    private static final int CAPACITY = 2;
    private int size;
    private AnyType[] heap;
    //endregion


    //region Constructors

    public Heap()
    {
        size = 0;
        heap = (AnyType[]) new Comparable[CAPACITY];
    }

    public Heap(AnyType[] array){
        this.size = 0;
        heap = (AnyType[]) new Comparable[array.length + 1];

        System.arraycopy(array, 0, heap, 1, array.length);
        buildHeap();
    }


    //endregion

    //region Helpers

    private void buildHeap() {
        for(int k = size/2 ; k > 0; k--){
            percolatingDown(k);
        }
    }

    private void percolatingDown(int k) {

        AnyType tmp = heap[k];
        int child;

        for(; 2*k  <= size; k = child){
            child = 2*k;

            if(child != size && heap[child].compareTo(heap[child + 1]) > 0)
                child++;

            if(tmp.compareTo(heap[child]) > 0)
                heap[k] = heap[child];
            else
                break;
        }

        heap[k] = tmp;
    }

    public void heapSort(AnyType [] array){
        size = array.length;
        heap = (AnyType[]) new Comparable[size+1];
        System.arraycopy(array, 0, heap, 1, size);
        buildHeap();

        for(int i = size; i > 0 ; i--){
            AnyType tmp = heap[i];
            heap[i] = heap[1];
            heap[1] = tmp;
            size--;
            percolatingDown(1);
        }
    }


    public void insert(AnyType newElement) {

        if(size == heap.length - 1)
            doubleSizeOfHeap();

        int pos = ++size;

        for(; pos > 1 && newElement.compareTo(heap[pos/2]) < 0; pos = pos /2 )
            heap[pos] = heap[pos / 2];

        heap[pos] = newElement;


    }

    private void doubleSizeOfHeap() {
        AnyType [] old = heap;
        heap = (AnyType[]) new Comparable[heap.length * 2];
        System.arraycopy(old, 1, heap, 1, size);
    }

    public AnyType deleteMin() {

        if(size == 0)
            throw new RuntimeException();

        AnyType min = heap[1];
        heap[1] = heap[size--];
        percolatingDown(1);
        return min;

    }

    public String toString()
    {
        String out = "";
        for(int k = 1; k <= size; k++) out += heap[k]+" ";
        return out;
    }

    //endregion





}
