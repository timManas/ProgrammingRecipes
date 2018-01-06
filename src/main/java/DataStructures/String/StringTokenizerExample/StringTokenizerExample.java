package DataStructures.String.StringTokenizerExample;

import java.util.StringTokenizer;

/**
 * Created by timmanas on 2018-01-06.
 */
public class StringTokenizerExample {

    //region Members
    //endregion

    //region Main
    public static void main(String[] args) {

        String string1 = "Hello Tim, how are you today ?";
        String string2 = "To Be Or Not To Be ?";
        String string3 = "That is question?";
        String string4 = "Lor!em imp$sum some!thing some!thing happe!ned he$re ";

        StringTokenizer stringTokenizer1 = new StringTokenizer(string1);
        StringTokenizer stringTokenizer2 = new StringTokenizer(string2, "e");
        StringTokenizer stringTokenizer3 = new StringTokenizer(string3, "is");
        StringTokenizer stringTokenizer4 = new StringTokenizer(string4, "!$");

        printTokens(stringTokenizer1);
        printTokens(stringTokenizer2);
        printTokens(stringTokenizer3);
        printTokens(stringTokenizer4);
    }
    //endregion

    //region Helper
    private static void printTokens(StringTokenizer stringToken) {

        while (stringToken.hasMoreTokens()) {
            System.out.println("Token: " + stringToken.nextToken());
        }
        System.out.println(" =================== ");

    }
    //endregion

}


/**

 String Tokenizer

 What ?
 - This is class which isued to break down a string into tokens
 - A token is returned by taking a substring of the string that was used to create the String Tokenizer
 - You can have more than one delimiter.


 Note
 - Notice setting the limiter as "is", does NOT split the string by the keyword "is".
 - Instead, anything which is part of "i" or "s" is treated as seperated tokens


 */