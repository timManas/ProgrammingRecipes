package Misc.DifferentWaysOfReadingFiles;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by timmanas on 2017-08-15.
 */
public class Main {

    //region Constants
    private static String filePath = "/Users/timmanas/ProgrammingProjects/ProgrammingRecipes/Resources/TestDocuments/TestFile.txt";
    private static File file = new File(filePath);
    //endregion

    //region Main method
    public static void main (String [] args) {


        try {
            // Example #1: Buffered Reader ...The best one
            System.out.println("\n\n ======= Buffered Reader =======");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String stringElements;
            while ((stringElements = bufferedReader.readLine()) != null)
                System.out.print(stringElements);



            // Example #2: FileReader Class
            System.out.println("\n\n ======= File Reader =======");
            FileReader fileReader = new FileReader(filePath);
            int index;
            while ((index = fileReader.read()) != -1){      // Note "-1" is the EOF
                System.out.print((char) index);
            }

            System.out.println("Notice how Buffered Reader requires a File Reader as one of its arguments");





            // Example #3: Scanner Class
            System.out.println("DO NOT USE SCANNERS !! Not synchronous and does not work with multi-threading");
            System.out.print("Slower than Buffered Reader");
            System.out.println("\n\n ======= Scanner Class =======");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
                System.out.print(scanner.nextLine());


            // Example #3a: Scanner Class without using loops
            System.out.println("\n\n ======= Scanner without using Loops =======");
            Scanner scannerNoLoops = new Scanner(file);
            scannerNoLoops.useDelimiter("\\Z");
            System.out.println(scannerNoLoops.next());


            // Example #4: Using readAllBytes .... Reading a text File as a String
            System.out.println("\n\n ======= Reading a text File as a String =======");
            String data = readFileAsString(filePath);
            System.out.println(data);

            // Reading the whole file in a List
            System.out.println("\n\n ======= Reading whole file in a list =======");
            List list = readFileInList(filePath);
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext())
                System.out.print(iterator.next());



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //endregion

    //region Helpers
    private static List<String> readFileInList(String filePath) {

        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
        }
        return lines;
    }


    private static String readFileAsString(String filePath) {

        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
    //endregion

}


/**
    Different ways of Reading a file

    1. Buffered Reader
        - Synchronous
        - Works with multi threading while Scanner does not
        - Reads line by line
        - Reads text from a Character input stream
        - Wrap BuffReader around any Reader which may be performance heavy... ex. FileReader & InputStreamReader
        - Syntax: BufferedReader in = new BufferedReader(Reader in, int size);


    2. File Reader Class
        - Best works for reading Character Files
        - Reads character by character
            Constructors for this class are     - FileReader(File file)
                                                - FileReader(FileDescriptor descriptor)
                                                - FileReader(String file)


    3. Scanner Class
        - This is a simple text scanner which can parse primitive types and strings using regex
        - Scanner breaks input into tokens using delimiter pattern (by default matches whitespaces)


    4. Scanner Class without using loops
        - We use a "\\Z" as delimiter which tells the the program to stop before the End of Character


    5. Reading the whole file in a list
        - Read all lines in a file
        - Ensure all all bytes have been read or I/O Error occurs
        - Looks for the following line terminators - \u000D followed by \u000A
                                                   - CARRIAGE RETURN followed by LINE FEED \u000A
                                                   - LINE FEED \u000D, CARRIAGE RETURN
        - Make sure you use UTF_8, otherwise you get some funky looking characters (Japanese characters)

    6. Reading a text file as a String



    Notes:
    - Notice how Buffered Reader requires a File Reader in one of its contructor arguements



    References
    - http://www.geeksforgeeks.org/different-ways-reading-text-file-java/
 */