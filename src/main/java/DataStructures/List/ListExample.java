package DataStructures.List;

import Misc.Synchronization.SyncDemo;

import java.util.*;

/**
 * Created by timmanas on 2017-09-15.
 */
public class ListExample {

    //region Members
    private static List numericList1;
    private static List numericList2;
    private static List stringList1;
    private static List stringList2;
    //endregion

    //region Main
    public static void main(String [] args) {

        // Create a List
        createList();

        // Iterator
        iterateList(numericList1);
        iterateList(stringList1);

        // Comparator
        compareList(numericList1, numericList1);

        // Useful Methods
        usefulMethods(numericList1, numericList1);
        usefulMethods(stringList1, numericList1);

    }


    //endregion

    //region Helpers

    private static void createList() {

        // Creating a List
        numericList1 = new ArrayList();
        numericList1.add(1);
        numericList1.add(3);
        numericList1.add(9);
        numericList1.add(4);
        numericList1.add(8);

        // Create  List using Generics
        stringList1 = new ArrayList<>();
        stringList1.add("Hello");
        stringList1.add("Mr.");
        stringList1.add("Manas");
        stringList1.add("You are the Best");


        numericList2 = new ArrayList();
        numericList2.add(4);
        numericList2.add(5);
        numericList2.add(6);
        numericList2.add(3);
        numericList2.add(2);

        // Create  List using Generics
        stringList2 = new ArrayList<>();
        stringList2.add("Yo");
        stringList2.add("Mr.");
        stringList2.add("Tim");
        stringList2.add("You are a Beast !!");

    }

    private static void iterateList(List list) {

        System.out.println("\n====== Iterating List ====== ");

        // Iterator through objects
        System.out.println("\nIterate using For Loop");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        // Iterate using while Loop
        System.out.println("\nIterate using While Loop");
        int i = 0;
        while (i < list.size()) {
            System.out.print(list.get(i));
            i++;
        }

        // Iterator using Iterator
        System.out.println("\nIterate using Iterator");
        Iterator iterator =  list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
        }

        // Iterate using a sequential Stream from Collections.Utils
        System.out.println("\nIterate using Collections.Util");
        list.forEach((temp) -> System.out.print(temp));

    }

    private static void compareList(List list1, List list2) {

        System.out.println("\n====== Comparing List ====== ");

        System.out.println("\nOriginal List1: " + list1);
        System.out.println("Original list2: " + list2);

        // Using the Equals
        System.out.println("\nUsing Equals comparator: " + list1.equals(list2));

        // Using the Deep Equals(list1, list2)
        Object [] arrayObj1 = list1.toArray();
        Object [] arrayObj2 = list1.toArray();
        System.out.println("Using the Arrays.equals() **Converted to List to Array: " + Arrays.deepEquals(arrayObj1, arrayObj2));


        // Using the good old fashion way
        if(list1 == null || list2 == null) {
            System.out.println("One of the List is null");
        }

        if(list1.size() != list2.size()) {
            System.out.println("Sizes of List are not the same");
        }

        if(list1.containsAll(list2)) {
            System.out.println("List1 & List2 are the same");
        }
    }


    private static void usefulMethods(List list, List temp) {

        System.out.println("\n====== Useful Methods ====== ");

        System.out.println("Original List: " + list);
        System.out.println("Original Temp: " + temp);

        // IndexOf - This works better if there are no duplicates
        System.out.println("\nIndexOf()");
        int index1 = list.indexOf("\nMr.");
        System.out.println("First Index of e: " + index1);

        int index2 = list.indexOf(8);
        System.out.println("First Index of 8: " + index2);

        // lastIndexOf - Returns the last index of the object detected
        System.out.println("\nLastIndexOf()");
        int index3 = list.lastIndexOf("Mr.");
        System.out.println("Last Index of e: " + index3);

        int index4 = list.lastIndexOf(8);
        System.out.println("Last Index of 8: " + index4);

        // SubList
        System.out.println("\nSubList1: " + list.subList(2,4));
        System.out.println("SubList2: " + list.subList(1,3));

        // Contains
        System.out.println("\nContains 'Mr.': " + list.contains("Mr."));
        System.out.println("Contains '8': " + list.contains(8));

        // Concatenate two arrays
        List tempList = new ArrayList(list);
        tempList.addAll(temp);

        // Convert List to Array
        System.out.println("\nConverting List to Array using toArray() using Object[]");
        Object [] newArray = list.toArray();
        for(Object element : newArray )
            System.out.println("Element: " + element);

        if(list.get(0) instanceof  String) {
            System.out.println("\nConverting List to Array using toArray() using type[]");
            String [] newArray2 = new String[list.size()];
            list.toArray(newArray2);
            for(String element : newArray2 )
                System.out.println("Element: " + element);
        }

        // Reverse an array
        Collections.reverse(temp);
        System.out.println("\nReverse List: " + temp);

        if(list.get(0) instanceof String) {
            // Convert List to Set
            System.out.println("\nConverting List to Set");
            Set<String> set1 = new HashSet<String>(list);
            for(String element : set1)
                System.out.println(element);
        }


    }

    //endregion

}
