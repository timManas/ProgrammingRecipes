package DataStructures.Queue.Deque;

import java.util.*;

/**
 * Created by timmanas on 2017-10-08.
 */
public class DequeExample {

    //region Members
    private static Deque<String> linkedListDeque;
    private static Deque<String> arrayDeque;
    private static Deque<String> deque1;
    //endregion

    //region Main
    public static void main(String [] args) {

        // Create a Dequeue
        createDeque();

        // Iterator
        iterateDeque();

        // Comparator
        compareDeque(arrayDeque, deque1);

        // Useful Methods
        usefulMethods();
    }
    //endregion

    //region Helper
    private static void createDeque() {

        linkedListDeque = new LinkedList();
        arrayDeque = new ArrayDeque();
        populateDeque();
    }

    private static void populateDeque() {

        // Populate Array Deque
        arrayDeque.add("Hello");
        arrayDeque.add("Tim");
        arrayDeque.add("We");
        arrayDeque.add("Meet");
        arrayDeque.add("Again");

        // Populate LinkedListDeque
        linkedListDeque.add("Bonjour");
        linkedListDeque.add("Romero");
        linkedListDeque.add("Give");
        linkedListDeque.add("Me");
        linkedListDeque.add("A");
        linkedListDeque.add("Reason");

        // Populate Deque1
        deque1 = new ArrayDeque(arrayDeque);
//        priorityQueueDeque = (Deque) new PriorityQueue<>(linkedListDeque);      // DOE NOT WORK. Prioritty Queue cannot be cast to Deque
    }

    private static void iterateDeque() {

        System.out.println("\nIterating Deque ======================= ");

        //Iterate using ForLoop
        System.out.println("Using For Loop");
        for(String element : arrayDeque) {
            System.out.println(element);
        }

        // Iterate using Iterator
        System.out.println("\nUsing Iterator");
        Iterator iterator = linkedListDeque.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    private static void compareDeque(Deque deque1, Deque deque2) {

        System.out.println("\nComparing Deque ======================= ");

        // Using the containsAll
        System.out.println("containsAll() :: Deque1 equals to Deque2 ? " + deque1.containsAll(deque2));

        // Using the RemoveAll
        // Step1. Use RemoveAll to removeAll Elements
        // Step2. If Deque is empty -> return True
        Deque<String> tempDeque1 = new LinkedList<>(deque1);
        Deque<String> tempDeque2 = new ArrayDeque<>(deque2);
        tempDeque1.removeAll(tempDeque2);
        if(tempDeque1.isEmpty())
            System.out.println("Using RemoveAll() & isEmpty() :: Deques are the same");
         else
            System.out.println("Using RemoveAll() & isEmpty() :: Deques are NOT the same");

    }

    private static void usefulMethods() {

        System.out.println("\nUseful Methods for Deque ======================= ");

        // Printing all Elements
        System.out.println("\nArrayDeque: " + arrayDeque);
        System.out.println("LinkedListDeque: " + linkedListDeque);
        System.out.println("Deque1: " + deque1);

        // addFirst() - ONLY EXIST FOR LinkedList
        arrayDeque.addFirst("First");
        linkedListDeque.addFirst("First");

        // addLast() - ONLY EXIST FOR LinkedList
        arrayDeque.addLast("Last");
        linkedListDeque.addLast("Last");

        // size()
        System.out.println("\nsize() :: ArrayDeque Size: " + arrayDeque.size());
        System.out.println("size() :: LinkedListDeque Size: " + linkedListDeque.size());

        // isEmpty()
        System.out.println("\nisEmpty() :: is ArrayDeque Empty ? " + arrayDeque.isEmpty());
        System.out.println("isEmpty() :: is LinkedListDeque Empty ? " + linkedListDeque.isEmpty());

        // contains()
        System.out.println("\ncontains() :: ArrayDeque contains 'Reason' ? " + arrayDeque.contains("Reason"));
        System.out.println("contains() :: LinkedListDeque contains 'Reason' ? " + linkedListDeque.contains("Reason"));

        // peek() - Returns the head of the Deque without removing from Deque.
        // Returns null is List if Empty
        System.out.println("\npeak() :: Peeking at the head of ArrayDeque: " + arrayDeque.peek());
        System.out.println("peakFirst() :: Peeking at the Head of ArrayDeque: " + arrayDeque.peekFirst());
        System.out.println("peakLast() :: Peeking at the Tail of ArrayDeque: " + arrayDeque.peekLast());

        // element() - Similar to Peek . Returns No Element if Queue is Empty
        System.out.println("element() :: Views head of Deque without it :: " + arrayDeque.element());

        // poll() - Returns and Removes  the head of the Queue
        System.out.println("\npoll() :: Remove Head of the ArrayDeque: " + arrayDeque.poll());
        System.out.println("ArrayDeque: " + arrayDeque);

        // Convert to ArrayList()
        System.out.println("\ntoArray() :: arrayDeque: " + new ArrayList<>(arrayDeque));
        System.out.println("toArray() :: linkedListDeque: " + new ArrayList<>(linkedListDeque));

        // Sort() - 1. Use PriorityList(For Sorting) and Convert back to Deque
        System.out.println("\nSort() - 1. Use PriorityList(For Sorting) and Convert back to Deque ");
        PriorityQueue<String> tempPriorityQueue = new PriorityQueue<>(linkedListDeque);
        Deque<String> tempDeque = new ArrayDeque<>();

        // ONLY BY REMOVING THE ELEMENTS WILL THE ELEMENTS COME OUT SORTED
        for(int i = tempPriorityQueue.size(); i > 0; i--) {
            String element = tempPriorityQueue.remove();
            tempDeque.add(element);
        }
        System.out.println("newLinkedList: " + tempDeque);

        // Sort() - 2. Use ArrayList, then use Collections.Sort()
        System.out.println("\nSort() - 2. Use ArrayList, then use Collections.sort()");
        ArrayList<String> tempArrayList = new ArrayList<>(arrayDeque);
        Collections.sort(tempArrayList);
        Deque<String> tempDeque2 = new ArrayDeque<>(tempArrayList);
        System.out.println("TempDeque2: " + tempDeque2);

        // Convert Deque to String (Or Int)
        StringBuilder stringBuilder = new StringBuilder();
        for(String element : arrayDeque) {
            stringBuilder.append(element);
        }
        System.out.println("\nArrayDeque to String: " + stringBuilder.toString());

        // Concatenate two Queues
        Deque<String> tempDeque3 = new ArrayDeque<>(arrayDeque);
        tempDeque3.addAll(linkedListDeque);
        System.out.println("\nConcatenate two Deques: " + tempDeque3);

        // Reverse a Dequeue Order
        ArrayList<String> tempArrayList1 = new ArrayList<>(arrayDeque);
        Collections.reverse(tempArrayList1);
        Deque<String> tempDeque4 = new ArrayDeque<>(tempArrayList1);
        System.out.println("\nReverse Deque Order: " + tempDeque4);

        // Swap values in a Queue (Applies to LinkedList or ArrayList Only =/)
        ArrayList<String> tempArrayList2 = new ArrayList<>(arrayDeque);
        Collections.swap(tempArrayList2, tempArrayList2.size() - 1, 1);
        Deque<String> tempDeque5 = new ArrayDeque<>(tempArrayList2);
        System.out.println("Swapped Deque: " + tempDeque5);

        // remove() - Similar to Poll but Returns an exception if List is Empty
        System.out.println("\nRemoves() :: Remove head - " + arrayDeque.remove());
        System.out.println("Remove - ArrayDeque: " + arrayDeque);

        // remove Object
        System.out.println("\nRemove(object) :: Remove at Object 'Meet': " + arrayDeque.remove("Meet")  );
        System.out.println("Remove(object) - ArrayDeque: " + arrayDeque);

        // removeAll() - Removes all elements
        ArrayDeque<String> tempDeque6 = new ArrayDeque<String>();
        tempDeque6.add("Tim");
        tempDeque6.add("Last");
        System.out.println("RemoveAll() :: Remove All Elements in ArrayDeque: " + arrayDeque.removeAll(tempDeque6));
        System.out.println("RemoveAll() - ArrayDeque: " + arrayDeque);

        // clear() - Much more Faster than RemoveAll()
        arrayDeque.clear();
        System.out.println("Clear() ::: Is ArrayDeque Empty ? " + arrayDeque.isEmpty());

    }
    //endregion

}

/**

 Dequeue Example

 What ?
 - Short for "Double Ended Queue"
 - Same as Queue except you can insert and remove Elements from BOTH ends of the queue.


 */
