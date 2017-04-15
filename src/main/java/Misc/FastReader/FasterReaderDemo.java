package Misc.FastReader;

/**
 * Created by timmanas on 2017-04-15.
 */
public class FasterReaderDemo {

    public static void main(String [] args) {

        FastReader fastReader = new FastReader();

        int numberOfIterations = fastReader.nextInt();
        int divisor = fastReader.nextInt();
        int count = 0;

        while (numberOfIterations-- > 0){

            int x = fastReader.nextInt();
            if(x % divisor == 0){
                count++;
            }

            System.out.println("n: " + numberOfIterations);
            System.out.println("x: " + x);
            System.out.println("Count: " + count);
        }
        System.out.println("===== Final Count: " + count);

    }
}


/**

 Fast Reader

 Notes
 - This is one of the fastest file reading methods
 - Gets accepted with a time of 1.23 seconds  and is very recommended
 - Utilizes BufferedReader and String Tokenizer
 - Biggest advantage of user defined methods for less typing and fast input.
 

 */

