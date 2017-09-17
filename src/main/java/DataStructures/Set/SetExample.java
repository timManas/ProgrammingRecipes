package DataStructures.Set;

import java.util.*;

/**
 * Created by timmanas on 2017-09-16.
 */
public class SetExample {

    //region Members
    private static Set set1;
    private static Set set2;
    private static Set set3;

    private static HashSet hashSet;
    private static LinkedHashSet linkedHashSet;
    private static TreeSet treeSet;

    //endregion

    //region Main
    public static void main(String [] args) {

        // Create a Map
        createSet();

        // Iterator
        iterateSet(linkedHashSet);
        iterateSet(treeSet);

        // Comparator
        compareSets(set1, set1);

        // Useful Methods
        usefulMethods(linkedHashSet);

    }


    //endregion

    //region Helper
    private static void createSet() {

        set1 = new HashSet();
        set2 = new HashSet();

        hashSet = new HashSet();
        linkedHashSet = new LinkedHashSet();
        treeSet = new TreeSet();

        populateSet();
    }

    private static void populateSet() {

        // Creating an array the old fashion way
        set1.add(4);
        set1.add(3);
        set1.add(8);
        set1.add(1);
        set1.add(3);

        // Populating the set using addAll() method
        Integer[] array =  new Integer[]{1, 6, 7, 9, 2};
        List<Integer> list = Arrays.asList(array);
        set2.addAll(list);

        set3 = new HashSet(set1);           // Create a new set with the Elements from Set1

        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(9);
        hashSet.add(1);

        linkedHashSet.add("Hello");
        linkedHashSet.add("Again");
        linkedHashSet.add("Monsieur");
        linkedHashSet.add("Timothy");
        linkedHashSet.add("Romero");

        treeSet.add("Bonjour");
        treeSet.add("AL.");
        treeSet.add("I");
        treeSet.add("miss");
        treeSet.add("you");
    }

    private static void iterateSet(Set<String> set) {

        // Using For Loop through Set
        System.out.println("\nIterate :: Using For Loop ");
        for(String msg : set)
            System.out.println(msg);


        // Using the Iterator Methods
        System.out.println("\nIterate :: Using the iterator");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    private static void compareSets(Set set1, Set set2) {

        // Using the equals method
        System.out.println("\nCompare using Equals() method ::: Set1 & Set2 equals ? " + set1.equals(set2));

        // Using the containsAll method
        System.out.println("Compare using contains() method ::: Set1 & Set2 equals ? " + set1.containsAll(set2));
    }

    private static void usefulMethods(Set set) {

        System.out.println("\nUseful Methods for Sets ======================= ");

        //Print all Elements
        System.out.println("\nSet: " + linkedHashSet);

        // add()
        set.add("Extra1");

        // contains()
        System.out.println("\nContains() ::: Set contains 'Timothy'? " + set.contains("Timothy"));
        System.out.println("Contains() ::: Set contains 'Bond'? " + set.contains("Bond"));
        System.out.println("Contains() ::: Set contains 'Sam Smith'? " + set.contains("Sam Smith"));

        // size()
        System.out.println("Size of Set: " + set.size());

        // How to find the difference between two sets ?
        String[] array =  new String[]{"Again", "Romero", "Extra1", "Timothy"};
        List<String> list = Arrays.asList(array);
        set.removeAll(list);

        // iterator()
        System.out.println("\nIterate :: Using the iterator");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // remove()
        System.out.println("\nRemoved Element 'Hello': " + set.remove("Hello"));

        // clear()
        set.clear();

        // isEmpty()
        System.out.println("Is Set Empty: " + set.isEmpty());

    }
    //endregion

}


/**

 Set

 What ?
 - Collection data structure which CANNOT contain duplicate elements
 - Only adds elements if no duplicates are found
 - Insertion/Removal for HashSet & LinkedHashSet is O(1). For TreeSet it is O(logn)

 Why ?


 Notes -
 - HashSet do not care about the ordering at all
 - LinkedHashSet maintain the order they are inserted into the Set
 - TreeSet maintains the order according to the alpha/numerical  elements of the Set

 - HashSet & LinkedHashSet allow for max one null value. Tree sets do NOT any null elements

 */