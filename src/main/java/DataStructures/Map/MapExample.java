package DataStructures.Map;

import java.util.*;

/**
 * Created by timmanas on 2017-09-16.
 */
public class MapExample {

    //region Members
    private static Map map1;
    private static Map map2;
    private static Map map3;
    private static HashMap map4;
    private static LinkedHashMap linkedHashMap;
    private static TreeMap treeMap;
    //endregion

    //region Main
    public static void main(String [] args) {

        // Create a Map
        createMap();

        // Iterator
        iterateMap(linkedHashMap);
        iterateMap(treeMap);

        // Comparator
        compareMap(map1, map1);

        // Useful Methods
        usefulMethods();
//        usefulMethods(map3, map4);

    }


    //endregion

    //region Helpers
    private static void createMap() {

        // Create a HashMap the Old fashion way
        map1 = new HashMap<Integer, String>();

        // Create a NEW Object (Not a reference) HashMap with a predefined size
        map2 = new HashMap(5);

        map3 = new TreeMap<String, String>();

        linkedHashMap = new LinkedHashMap<Integer, String>();
        treeMap = new TreeMap<Integer, String>();

        populateMaps();

        // Create a HashMap from another Map
        map4 = new HashMap(map1);
    }

    private static void populateMaps() {

        map1.put(1, "Hello");
        map1.put(4,"Mr.");
        map1.put(5, "Tim");
        map1.put(6, "We meet");
        map1.put(2, "Again !!");

        map2.put(8, "Go");
        map2.put("Key1", "Forth");
        map2.put(5, "&");
        map2.put("Key2", "Conquer");
        map2.put("Key3", null);

        map3.put("Key1", "Value1");
        map3.put("Key2", null);
        map3.put("Key3", "Value3");
        map3.put("Key4", "Value4");
        map3.put("Key5", "Value5");

        linkedHashMap.put(1, "Hello");
        linkedHashMap.put(4,"Mr.");
        linkedHashMap.put(5, "Tim");
        linkedHashMap.put(6, "We meet");
        linkedHashMap.put(2, "Again !!");

        treeMap.put(1, "Bonjour");
        treeMap.put(4,"Dr.");
        treeMap.put(9, "Bond");
        treeMap.put(6, "How would you like to");
        treeMap.put(2, "Die !!");

    }

    private static void iterateMap(Map<Integer, String> map){

        // Method#1 - Iterate over Entries using ForEach
        System.out.println("\nIterating over Entries using ForEach");
        for(Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println("Key: " + entry.getKey() + "     Value: " + entry.getValue());


        // Method#2 - Iterating over key or Values using For Each
        System.out.println("\nIterating over key or values using ForEach");
        for(int key : map.keySet())
            System.out.println("Key: " + key);

        for(String values : map.values())
            System.out.println("Values: " + values);

        // Method#3 - Iterating using an Iterator
        System.out.println("\nIterating using an Iterator");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + "     Value: " + entry.getValue());
        }
    }

    private static void compareMap(Map map1, Map map2) {

        // Using the Equals Method
        System.out.println("CompareMap :: Equals Method - Map1 & Map2: " + map1.equals(map2));

        //Check each entry one by one
        List<String> values1 = new ArrayList<String>(map1.values());
        List<String> values2 = new ArrayList<String>(map2.values());
        Collections.sort(values1);
        Collections.sort(values2);
        System.out.println("CompareMap :: Convert to List Method - Map1 & Map2: " + values1.equals(values2));

    }

    private static void usefulMethods() {

        System.out.println("\nUseful Methods for Maps ======================= ");

        //Print all Elements
        System.out.println("\nLinkedHashMap: " + linkedHashMap);

        // clone
        System.out.println("Cloning Map -- We dont use the clone(), since that is broken anyway");
        LinkedHashMap tempLinkedHashMap = new LinkedHashMap(linkedHashMap);

        // containsKey
        System.out.println("ContainsKey() :: map1 contain key '6': " + linkedHashMap.containsKey(6));
        System.out.println("ContainsKey() :: map1 contain key '1': " + linkedHashMap.containsKey(1));
        System.out.println("ContainsKey() :: map1 contain key '99': " + linkedHashMap.containsKey(99));

        // containsValue
        System.out.println("ContainsValue() :: map1 contains value 'Again': " + linkedHashMap.containsValue("Again !!"));
        System.out.println("ContainsValue() :: map1 contains value 'Mr.': " + linkedHashMap.containsValue("Mr."));
        System.out.println("ContainsValue() :: map1 contains value 'Tim': " + linkedHashMap.containsValue("Amanda"));

        // get
        System.out.println("get() ::: Getting the Value from Key '2': " + linkedHashMap.get(2));

        // keySet
        System.out.println("\nKeySet :: Get List of All Kets");
        for(Object key : linkedHashMap.keySet())
            System.out.println("Key: " + key);

        // replace
        System.out.println("Replace() ::: Replace key'5' from Tim to 'Romero': " + linkedHashMap.replace(5, "Tim", "Romero"));
        System.out.println("Replace() ::: Replace key'5' from Tim to 'Manas' (Should be false since Tim doesent Exist anymore): " + linkedHashMap.replace(5, "Tim", "Manas"));
        System.out.println("Replace() ::: Replace key'5'  to 'BadMon': " + linkedHashMap.replace(5, "BadMon"));

        // put
        System.out.println("Put() ::: Put Key '99': " + linkedHashMap.put(99, "For Realz ?"));

        // putAll
        System.out.println("PutAll() ::: Put all Values of map2 into map1 (Notice we replace & add values as well ? ");
        linkedHashMap.putAll(treeMap);

        // clear
        System.out.println("Clearing Map");
        linkedHashMap.clear();
        treeMap.clear();

    }

    //endregion


}


/**

 Map

 What ?
 - Uses a key value pair to store
 - No duplicate keys allowed
 - Allows only 1 null Key / Value pair

 Why ?

 Notes
 - Uses a HashTable to store to implement Map Interface
 - Execution time of basic operation get/put to a remain constant even for large sets - Big O(1) - HOLY SHIT !!!!!
 - HashMap do NOT store the order of the key/values
 - LinkedHashMap will store the key/value pair in the order they were inserted
 - TreeMap is ordered by the Key (implemented as Red Black Tree)
 - HashTabble is synchronized
 - PLEASE, PLEASE Specify the type of key value pair when Creating these bastards -__- . Ex.  new HashMap<Integer, String>()
 */