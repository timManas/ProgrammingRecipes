package MultiThreading.BlockingQueueExample;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueDemo {

    public static void main(String [] args) throws InterruptedException {

        int maxCapacity = 5;

        ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(maxCapacity);

        // Add Elements to blocking Queue
        blockingQueue.put("One");
        blockingQueue.put("Two");
        blockingQueue.put("Three");
        System.out.println("Queue: " + blockingQueue);
        blockingQueue.put("Four");
        blockingQueue.put("Five");

        /** If you comment this line out, Queue will get blocked */
        System.out.println("Removing Element from Queue: " + blockingQueue.remove());
        blockingQueue.put("Six");
        System.out.println("Queue: " + blockingQueue);
        System.out.println("Removing Element from Queue: " + blockingQueue.remove());
        System.out.println("Removing Element from Queue: " + blockingQueue.remove());
        blockingQueue.put("Seven");
        blockingQueue.put("Eight");
        System.out.println("Queue: " + blockingQueue);


        // Contains()
        System.out.println("Contains Element 'Seven' ? " + blockingQueue.contains("Seven") + "\n");

        // Fetch the size of the Queue
        System.out.println("Size of Queue: " + blockingQueue.size() + "\n");

        // Find out how many spots available in Queue
        System.out.println("Spots left in Queue: " + blockingQueue.remainingCapacity() + "\n");

        // Take from Queue and place in COllection ..ex List
        ArrayList<String> list = new ArrayList<>();
        blockingQueue.drainTo(list);
        System.out.println("Drain To List: "  + list);
        System.out.println("Queue After Drain: " + blockingQueue);
    }

}

/**
 What ?
 - Blocking Queue is a queue which blocks when:
    > Queue has reached its MAX capacity when trying to Enqueue
    > Queue has no Elements when trying to dequeue

 Why ?
 - Avoid consuming null data

When ?
 - Used in Producer-Consumer frameworks


 Note
 - There is a built in "BlockingQueue" object in Java 1.5
 */