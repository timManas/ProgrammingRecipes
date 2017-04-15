package Misc.FastReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SyncFailedException;
import java.util.StringTokenizer;

/**
 * Created by timmanas on 2017-04-15.
 */
public class FastReader {

    private BufferedReader bufferedReader;
    private StringTokenizer stringTokenizer;

    public FastReader () {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    protected String next() {
        while (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {

            try{
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return stringTokenizer.nextToken();
    }

    protected int nextInt() {
        return Integer.parseInt(next());
    }

    protected Long nextLong() {
        return Long.parseLong(next());
    }

    protected Double nextDouble() {
        return Double.parseDouble(next());
    }

    protected String nextLine() {
        String string = "";
        try {
            string = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return string;
    }

}
