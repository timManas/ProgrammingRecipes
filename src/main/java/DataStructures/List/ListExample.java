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

    private static Stack stack1;
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
        usefulMethods();

    }


    //endregion

    //region Helpers

    private static void createList() {

        // Creating a List
        numericList1 = new ArrayList<Integer>();
        numericList1.add(1);
        numericList1.add(3);
        numericList1.add(9);
        numericList1.add(4);
        numericList1.add(8);

        // Create  List using Generics
        stringList1 = new ArrayList<String>();
        stringList1.add("Hello");
        stringList1.add("Mr.");
        stringList1.add("Manas");
        stringList1.add("Show me the money");

        numericList2 = new ArrayList<Integer>();
        numericList2.add(4);
        numericList2.add(5);
        numericList2.add(6);
        numericList2.add(3);
        numericList2.add(2);

        // Create  List using Generics
        stringList2 = new ArrayList<String>();
        stringList2.add("Yo");
        stringList2.add("Dr.");
        stringList2.add("Tim");
        stringList2.add("You are a Beast !!");

        stack1 = new Stack();
        stack1.add(3);
        stack1.add(6);
        stack1.add(9);
        stack1.add(1);
        stack1.add(8);

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
        System.out.println("Original stack1: " + stack1);

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


    private static void usefulMethods() {

        System.out.println("\n======================= Useful Methods for List ======================= ");

        // Print All Elements
        System.out.println("numericList1: " + numericList1);
        System.out.println("numericList2: " + numericList2);

        System.out.println("stringList1: " + stringList1);
        System.out.println("stringList2: " + stringList2);

        // IndexOf - This works better if there are no duplicates
        System.out.println("\nIndexOf()");
        int index1 = stringList1.indexOf("Manas");
        System.out.println("First Index of 'Manas': " + index1);

        int index2 = numericList1.indexOf(8);
        System.out.println("First Index of 8: " + index2);

        // lastIndexOf - Returns the last index of the object detected
        System.out.println("\nLastIndexOf()");
        int index3 = stringList1.lastIndexOf("Tim.");
        System.out.println("Last Index of Tim: " + index3);

        int index4 = numericList2.lastIndexOf(2);
        System.out.println("Last Index of 2: " + index4);

        // SubList
        System.out.println("\nSubList1: " + stringList1.subList(2,4));
        System.out.println("SubList2: " + numericList1.subList(1,3));

        // Contains
        System.out.println("\nContains 'Mr.': " + stringList1.contains("Mr."));
        System.out.println("Contains '8': " + numericList1.contains(8));

        // Concatenate two arrays
        List tempList = new ArrayList<>(stringList1);
        tempList.addAll(stringList2);
        System.out.println("Concatenate() :: TempList: " + tempList);

        // Convert List to Array
        System.out.println("\nConverting List to Array using toArray() using Object[]");
        Object[] intArray = numericList1.toArray();
        for(Object element : intArray )
            System.out.println("Element: " + element);

        System.out.println("\nConverting List to Array using toArray() using Object[] --- If you take away the size. You get an exception error");
        String[] intArray2 = (String[]) stringList2.toArray(new String[stringList2.size()]);
        for(String element : intArray2 )
            System.out.println("Element: " + element);

        System.out.println("\nConverting List to Array using toArray() using type[]");
        String [] stringArray2 = new String[stringList2.size()];
        stringList2.toArray(stringArray2);
        for(String element : stringArray2 )
            System.out.println("Element: " + element);

        // Reverse an array
        Collections.reverse(tempList);
        System.out.println("\nReverse() :: using Collections.reverse() ::: TempList: " + tempList);

        // Swap values in an array
        Collections.swap(tempList, 0, tempList.size() - 1);
        System.out.println("\nSwap() TempList: " + tempList);

        // Convert List to Set
        System.out.println("\nConverting List to Set");
        Set<String> set1 = new HashSet<>(stringList1);
        System.out.println("Set: " + set1);

    }

    //endregion

}
