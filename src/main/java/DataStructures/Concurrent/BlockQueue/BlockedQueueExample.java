package DataStructures.Concurrent.BlockQueue;

import java.util.concurrent.*;

/**
 * Created by timmanas on 2019-01-12.
 */
public class BlockedQueueExample {

    //region Members

    //endregion

    //region Main
    public static void main(String [] args) {

        System.out.println("Several different types of blocking queues");

        // Ex1 : Array Blocking Queue
        int capacity = 10;
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<String>(capacity);

        // Ex2 : Linked Blocking Queue
        LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue();

        // Ex3 : Linked Blocking Deque
        LinkedBlockingDeque<String> linkedBlockingDeque = new LinkedBlockingDeque();

        // Ex4: Linked Transfer Queue
        LinkedTransferQueue<String> linkedTransferQueue = new LinkedTransferQueue<>();

        // Ex4 : Priority Blocking Queue
        PriorityBlockingQueue<String> priorityBlockingQueue = new PriorityBlockingQueue();

        // Ex5: Synchronous Queue
        SynchronousQueue<String> synchronousQueue = new SynchronousQueue();

        // Ex6: Delay Queue
//        DelayQueue<String> delayQueue = new DelayQueue();

    }
    //endregion

    //region Functions

    //endregion


}


/**
 Block Queue

 What ?
 - Queue that blocks when you try to dequeue  from it when the queue is empty OR try to enqueue items to it when queuee is already full
 - Queue which supports operations that
    - wait for queue to become non-empty when retrieving or removing element
    - wait for space to become available when adding new element
 - Does not accept null values
 - Thread safe


 */