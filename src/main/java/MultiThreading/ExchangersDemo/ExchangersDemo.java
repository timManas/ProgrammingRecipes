package MultiThreading.ExchangersDemo;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExchangersDemo {

    public static void main(String [] args) {

        // Create Exchanger of type String
        Exchanger<String> exchanger = new Exchanger<>();

        // Iniaitlize the Runnable classes
        UseString useString = new UseString(exchanger);
        MakeString makeString = new MakeString(exchanger);

        // Create Thread and execute
        Thread thread1 = new Thread(useString);
        Thread thread2 = new Thread(makeString);
        thread1.start();
        thread2.start();
    }
}


class MakeString implements Runnable {

    // Properties
    Exchanger<String> exchanger;
    String str;

    public MakeString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        str = new String();
    }

    @Override
    public void run() {
        char letter = 'A';
        try {
            for (int i=0; i < 5; i++) {

                // Increment the character
                for (int j=0; j < 3; j++)
                    str += letter++;

                // If reached the last element
                if (i == 2) {
                    str = exchanger.exchange("XXX");
                    System.out.println("Count: " + i + "    Makestring got Exchanged String: " + str);
                    continue;
                }

                str = exchanger.exchange(str);
                System.out.println("Count: " + i + "    Makestring got Exchanged String: " + str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class UseString implements  Runnable{

    // Properties
    Exchanger<String> exchanger;
    String str;

    public UseString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        str = new String();
    }

    @Override
    public void run() {
        try {
            for (int i=0; i < 5; i++) {

                if (i == 2) {
                    // We make thread sleep so we can cause a timeout during the exchange
                    str = exchanger.exchange("YYY");
                    System.out.println("Count: " + i + "    UseString got Exchanged String: " + str);
                    continue;
                }

                // Exchanges the Data
                str = exchanger.exchange(String.valueOf(i));
                System.out.println("Count: " + i + "    UseString got Exchanged String: " + str);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



/**
 What ?
 - Facilitates the exchange of elements between two threads by creating synchronization point

 How ?
 - Awaits Until Two seperate threads call "exchange()"
 - Then Exchange occurs between two threads

 Note
 - Also known as a BiDirectional Synchronous Queue


 */