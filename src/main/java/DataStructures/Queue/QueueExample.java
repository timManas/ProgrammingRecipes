package DataStructures.Queue;

import java.util.*;

/**
 * Created by timmanas on 2017-09-17.
 */
public class QueueExample {

    //region Members
    private static Queue<String> queue1;
    private static Queue<Integer> queue2;
    private static LinkedList<Integer> tempQueue;

    private static LinkedList<String> linkedList;
    private static PriorityQueue<String> priorityQueue;
    //endregion

    //region Main
    public static void main(String [] args) {

        // Create a Map
        createQueue();

        // Iterator
        iterateQueue(linkedList);
        iterateQueue(priorityQueue);

        // Comparator
        compareQueue(tempQueue, queue2);

        // Useful Methods
        usefulMethods();
    }
    //endregion

    //region Helpers
    private static void createQueue() {

        queue1 = new LinkedList();
        queue2 = new PriorityQueue();

        linkedList = new LinkedList();
        priorityQueue = new PriorityQueue();

        tempQueue = new LinkedList<>();

        populateQueue();
    }

    private static void populateQueue() {

        queue1.add("Hello");
        queue1.add("Tim");
        queue1.add("We");
        queue1.add("Meet");
        queue1.add("Again");

        queue2.add(3);
        queue2.add(7);
        queue2.add(9);
        queue2.add(1);
        queue2.add(6);

        linkedList.add("Bonjour");
        linkedList.add("AL");
        linkedList.add("Give");
        linkedList.add("Me");
        linkedList.add("A");
        linkedList.add("Reason");

        priorityQueue.add("Timothy");
        priorityQueue.add("John");
        priorityQueue.add("Romero");
        priorityQueue.add("Manas");

        tempQueue.add(3);
        tempQueue.add(7);
        tempQueue.add(9);
        tempQueue.add(1);
        tempQueue.add(6);

        // You can also Create Queue from Sets, Maps and List
        LinkedHashSet tempSet = new LinkedHashSet();
        tempSet.add(3);
        tempSet.add(6);
        PriorityQueue<Integer> tempQueue1 = new PriorityQueue<>(tempSet);
        System.out.println("Convert from Set to Queue: " + tempQueue1);

        LinkedHashMap<String, String> tempMap = new LinkedHashMap<>();
        tempMap.put("First", "Hello World");
        tempMap.put("Second", "Bonjour Tim");
        tempMap.put("Third", "Bonsoir Kira");
        PriorityQueue<String> keys = new PriorityQueue<>(tempMap.keySet());
        PriorityQueue<String> values = new PriorityQueue<>(tempMap.values());
        System.out.println("Convert Map Keys to Queue: " + keys);
        System.out.println("Convert Map Values to Queue: " + values);

        LinkedList<String> tempLinkedList = new LinkedList<>();
        tempLinkedList.add("Hello");
        tempLinkedList.add("World");
        tempLinkedList.add("Hi");
        PriorityQueue<String> tempQueue2 = new PriorityQueue<>(tempLinkedList);
        System.out.println("Convert LinkedList to Queue: " + tempQueue2);

        PriorityQueue<String> tempQueue = new PriorityQueue<>();
        tempQueue.add("First");
        tempQueue.add("Second");
        tempQueue.add("Third");
        PriorityQueue<String> tempQueue3 = new PriorityQueue<>(tempQueue);
        System.out.println("Convert Queue to Queue: " + tempQueue3);


    }

    private static void iterateQueue(Queue<String> queue) {
        // Using a forLoop
        System.out.println("\n Iterate Using For Loop");
        for(String element : queue)
            System.out.println("Iterate :: For loop - " + element);

        // Using an Iterator
        System.out.println("\nIterate using Iterator");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext())
            System.out.println("Iterate :: Using Iterator - " + iterator.next());

    }

    private static void compareQueue(Queue queue1, Queue queue2) {

        // Using the containsAll
        System.out.println("\nCompare() ::: containsAll() ::: Queue1 equals to Queue2: " + queue1.containsAll(queue2));

        // Using the removeAll
        // Step1. Use removeAll to removeAll Elements
        // Step2. If Queue is null. Same
        Queue<String> tempQueue1 = new LinkedList<>(queue1);
        Queue<String> tempQueue2 = new PriorityQueue<>(queue2);
        tempQueue1.removeAll(tempQueue2);
        if(tempQueue1.isEmpty())
            System.out.println("Compare() :: Using RemoveAll & isEmpty :: Queues are the same");
        else
            System.out.println("Compare() :: Using RemoveAll & isEmpty :: Queues are NOT the same");

    }

    private static void usefulMethods() {

        System.out.println("\nUseful Methods for Queue ======================= ");
        // Printing all Elements
        System.out.println("\nQueue1: " + queue1);
        System.out.println("Queue2: " + queue2);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("PriorityQueue: " + priorityQueue);


        // addFirst() - ONLY EXIST FOR LinkedList
        linkedList.addFirst("ExtraFirst");

        // addLast() - ONLY EXIST FOR LinkedList
        linkedList.addLast("ExtraEnd");
        System.out.println("LinkedList: " + linkedList);

        // size()
        System.out.println("\nsize() :: Queue1 Size: " + queue1.size());
        System.out.println("size() :: Queue2 Size: " + queue2.size());
        System.out.println("size() :: LinkedList Size: " + linkedList.size());
        System.out.println("size() :: Priority Size: " + priorityQueue.size());

        // isEmpty()
        System.out.println("isEmpty() :: Is LinkedListEmpty ? " + linkedList.isEmpty());

        // contains()
        System.out.println("contains() :: LinkedList contains 'Reason': " + linkedList.contains("Reason"));

        // peek() - Returns the head of the Queue without removing from Queue. Returns null is List if Empty
        System.out.println("\npeak() :: Peeking at the Head LinkedList:" + linkedList.peek());
        System.out.println("peakFirst() :: Peeking at the Head LinkedList:" + linkedList.peekFirst());
        System.out.println("peakLast() :: Peeking at the Head LinkedList:" + linkedList.peekLast());

        System.out.println("\npeak() :: Peeking at the Head PriorityQueue:" + priorityQueue.peek());
//        System.out.println("peakFirst() :: Peeking at the Head LinkedList:" + priorityQueue.peekFirst());
//        System.out.println("peakLast() :: Peeking at the Head LinkedList:" + priorityQueue.peekLast());

        // element() - Similar to Peek . Returns No Element if Queue is Empty
        System.out.println("element() :: Views head of queue without removing :: " + linkedList.element());

        // poll() - Returns and Removes  the head of the Queue
        System.out.println("\npoll() :: Remove Head of the LinkedList: " + linkedList.poll());
        System.out.println("LinkedList: " + linkedList);

        // Convert to ArrayList()
        System.out.println("\ntoArrary() :: linkedList: " + new ArrayList<>(linkedList));
        System.out.println("toArray() :: prioirtyQueue: " + new ArrayList<>(priorityQueue));


        // Sort LINKED LIST - Use Collection.sort(). ONLY WORKS ON LINKEDLIST
        Collections.sort(tempQueue);
        System.out.println("\nSort() :: Using Collections.sort() :: linkedList: " + tempQueue);

        // Sort() - 1. Use PriorityList(For Sorting) and Convert back to LinkedList
        System.out.println("\nSort() - 1. Use PriorityList(For Sorting) and Convert back to LinkedList ");
        LinkedList<Integer> newLinkedList = new LinkedList<>();
        PriorityQueue<Integer> tempPriorityQueue = new PriorityQueue<>(queue2);
        System.out.println("tempPrioirtyQueue: " + tempPriorityQueue);

        tempPriorityQueue.add(9);
        tempPriorityQueue.add(3);
        tempPriorityQueue.add(1);
        System.out.println("After elements was added :: tempPrioirtyQueue: " + tempPriorityQueue);

        // ONLY BY REMOVING THE ELEMENTS WILL THE ELEMENTS COME OUT SORTED
        for(int i = tempPriorityQueue.size(); i > 0; i--) {
            int element = tempPriorityQueue.remove();
            newLinkedList.add(element);
        }
        System.out.println("newLinkedList: " + newLinkedList);

        // Sort() - 2. Use TreeSet(For Sorting) and Convert back to LinkedList (NOTE: THIS SOLUTION DOES NOT ALLOW FOR DUPLICATES BECAUSE OF SETS)
        System.out.println("\nSort() - 2. Use TreeSet(For Sorting) and Convert back to LinkedList");
        TreeSet<Integer> tempTreeSet = new TreeSet<>(queue2);
        tempTreeSet.add(9);
        tempTreeSet.add(3);
        tempTreeSet.add(1);
        System.out.println("tempTreeSet: " + tempTreeSet);
        LinkedList<Integer> newLinkedListII = new LinkedList<>(tempTreeSet);
        System.out.println("newLinkedListII: " + newLinkedListII);

        // Sort() - 3. Use ArrayList(For Sorting) and Convert back to LinkedList
        System.out.println("\nSort() - 3. Use ArrayList(For Sorting) and Convert back to LinkedList ");
        ArrayList<Integer> tempArrayList = new ArrayList<>(queue2);
        tempArrayList.add(9);
        tempArrayList.add(3);
        tempArrayList.add(1);
        System.out.println("tempArrayList: " + tempArrayList);
        Collections.sort(tempArrayList);
        LinkedList<Integer> newLinkedListIII = new LinkedList<>(tempArrayList);
        System.out.println("newLinkedListIII: " + newLinkedListIII);

        // Convert LinkedList to String (Or Int)
        StringBuilder stringBuilder = new StringBuilder();
        for(String element : linkedList)
            stringBuilder.append(element);
        System.out.println("Convert LinkedList to String: " + stringBuilder.toString());

        // Concatenate two Queues
        Queue<String> concatentatedQueue = new LinkedList<>(linkedList);
        concatentatedQueue.addAll(priorityQueue);
        System.out.println("\nConcatenate two Queues together :: " + concatentatedQueue);

        // Reverse a LinkedList Order ....
        LinkedList<String> reverseList = new LinkedList<>(linkedList);
        Collections.reverse(reverseList);
        System.out.println("\nReverse of LinkedList: " + reverseList);

        // Swap values in a Queue (Applies to LinkedList Only =/)
        Collections.swap(linkedList, 0, linkedList.size() - 1);
        System.out.println("Swapped LinkedList: " + linkedList);

        // remove() - Similar to Poll but Returns an exception if List is Empty
        System.out.println("\nRemoves() :: Remove head  " + linkedList.remove());
        System.out.println("LinkedList: " + linkedList);

        // remove at Index i
        System.out.println("remove(index) :: Remove at index '4': " + linkedList.remove(4));

        // remove Object
        System.out.println("remove(object) :: Remove object 'Me': " + linkedList.remove("Me"));
        System.out.println("LinkedList: " + linkedList);

        System.out.println("remove(object) :: Remove object 'Romero' from Priority Queue: " + priorityQueue.remove("Romero"));
        System.out.println("Priority Queue: " + priorityQueue);

        // retainAll() - Removes All elements Except for the values inside parameter
        Queue retainList = new LinkedList();
        retainList.add("Give");
        retainList.add("ExtraEnd");
        System.out.println("\nRetainAll() :: Remove all Elements except for: " + linkedList.retainAll(retainList));
        System.out.println("LinkedList: " + linkedList);

        // removeAll() - Removes all elements
        Queue removeList = new LinkedList();
        removeList.add("Timothy");
        removeList.add("Romero");
        System.out.println("RemoveAll():: Remove all Elements which matches list: " + priorityQueue.removeAll(removeList));
        System.out.println("Prioirty Queue: " + priorityQueue);

        // clear() - Much more Faster than RemoveAll()
        priorityQueue.clear();
        System.out.println("Clear() ::: Is PriorityQueue Empty ? " + priorityQueue.isEmpty());


    }
    //endregion

}


/**

 Queues

 What ?
 - Follows the principle of FIFO (First In & First Out)

 Why ?

 Notes
 - LinkedList - Places the elements in the order they were inserted
 - Priority Queue  - Places the elements in the order of the elements (i.e similiar to TreeSet & TreeMap)



 */
