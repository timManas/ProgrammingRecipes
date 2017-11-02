package DataStructures.String;

/**
 * Created by timmanas on 2017-10-14.
 */
public class StringExample {

    //region Main
    public static void main(String args[]) {

        String testString1 = "Lorem ipsum dolor sit";
        String testString2 = "Hello World";

        // Get Length of String
        System.out.println("Length: " + testString1.length());

        // Concatenate String - Method#1 - Using the '+'
        String testString3 = "This is another String";
        testString3 = testString3 + " " + testString1;
        System.out.println("Concatenate String '+': " + testString3);

        // Concatenate String - Method#2 - Using the 'cat()'
        System.out.println("Concatenate String 'cat()': " + testString3.concat(testString2));

        // Character at specific Index
        System.out.println("Character at Index[6]:" + testString1.charAt(6));

        // Compare Two Strings lexicographically
        String cat = "cat";
        String dog = "dog";
        String frog = "frog";
        String cars = "cars";
        System.out.println("Compare two String  (cat vs dog): " + cat.compareTo(dog));
        System.out.println("Compare two String  (cat vs frog): " + cat.compareTo(frog));
        System.out.println("Compare two String  (dog vs frog):" + dog.compareTo(frog));
        System.out.println("Compare two String (cat vs cat): " + cat.compareTo(cat));
        System.out.println("Compare two String (cat vs car): " + cat.compareTo(cars));

        // Ends with
        System.out.println("Ends With 'World': " + testString2.endsWith("World"));

        // Contains Substring
        System.out.println("Contains the Word 'Hell': " + testString2.contains("Hell"));

        // Get the Index of SubString in a String
        System.out.println("Index of Substring 'sum': " + testString1.indexOf("sum"));

        // Get the Last Index of Character
        System.out.println("Last Index of Substring 'or': " + testString1.lastIndexOf("or"));

        // Does this string match the Regex

        // Replace all occurerence
        System.out.println("Replace 'o' with 'O': " + testString2.replace("o", "O"));

        // Get Substring
        System.out.println("Get Substring from index 3 - 8': " + testString2.substring(3, 8));

        // Convert to charArray
        char [] stringCharArray = testString1.toCharArray();
        System.out.println(stringCharArray);


        // Convert to Upper case
        System.out.println("Convert to upper case: " + testString1.toUpperCase());

        // Convert to Lower case
        System.out.println("Convert to lower case: " + testString1.toLowerCase());

        // Get rid of all white spaces
        String testString4 = "      I loved you then, I love you now        =)          ";
        System.out.println("Get rid of all white spaces: " + testString4.trim());


        // Split String to tokens
        System.out.println("Split String to tokens 'o'");
        String [] strArray = testString1.split("o");
        for(String element : strArray)
           System.out.println(element);

        // Reverse a String
        StringBuilder stringBuilder = new StringBuilder(testString1);
        System.out.println("Reverse a String: " +  stringBuilder.reverse().toString());

    }
    //endregion
    

}
