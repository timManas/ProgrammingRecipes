package DataStructures.Concurrent.ConcurrentHashMap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by timmanas on 2019-01-10.
 */
public class ConcurrentHashMapExample {


    // region Members

    //endregion

    //region Main
    public static void main(String [] args) {

        // Create Concurrent Hash Map
        ConcurrentHashMap<Integer, String> cHashMap = new ConcurrentHashMap<>();

        // Populate Map
        cHashMap.put(1, "Hello");
        cHashMap.put(4, "Mr.");
        cHashMap.put(5, "Tim");
        cHashMap.put(6, "We meet");
        cHashMap.put(2, "Again !!");


        // Iterator

        // Comparator

        // Useful Methods

        // Print All Elements
        System.out.println("Printing All Elements on ConcCurrentHashMap");
        System.out.println("cHashMap: " + cHashMap);

        // Add If Present Absent
        cHashMap.putIfAbsent(10, "XXX");            // It will Add this
        cHashMap.putIfAbsent(10, "YYY");            // It will NOT add this because key "10" already exists
        System.out.println("cHashMap: " + cHashMap);

        // Get all Keys
        System.out.println("Get All keys: " + cHashMap.keys());

        // Get all Values
        System.out.println("Get All values: " + cHashMap.values() + "\n");

        // clone
        ConcurrentHashMap<Integer, String> clonedConcHashMap = new ConcurrentHashMap<>(cHashMap);
        System.out.println("Cloned Concurrent HashMap: " + clonedConcHashMap);

        // containsKey
        System.out.println("\nContains key '10': " + cHashMap.containsKey(10));

        // containsValue
        System.out.println("Contains value 'Tim': " + cHashMap.containsValue("Tim"));

        // EntrySet ...Has both key and value
        System.out.println("\nPrint both key and value using entrySet");
        for (Map.Entry<Integer, String> keyValue : cHashMap.entrySet()) {
            System.out.println("Key: " + keyValue.getKey() + "      value: " + keyValue.getValue());
        }

        // Convert Map Keys to LinkedList
        List<Integer> keyLinkedList = new LinkedList<>(cHashMap.keySet());
        System.out.println("\nkeyLinkedList: " + keyLinkedList);

        // Convert Map Values to List
        List<String> valueList = new ArrayList<>(cHashMap.values());
        System.out.print("valueList: " + valueList);

        // remove
        cHashMap.remove(2);
        System.out.println("Removing 'Again': " + cHashMap);

        // Clear
        cHashMap.clear();
        System.out.println("\nCleared Concurrent Hash Map: " + cHashMap);

        // isEmpty
        System.out.println("Is Empty ? " + cHashMap.isEmpty());







    }


    //endregion


    //region Helpers

    //endregion


}



/**

 Concurrent Hash Map

 What ?

 Why ?

 When ?

 Notes


 */