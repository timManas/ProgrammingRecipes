package MultiThreading.InterThreadCommunication;

import Misc.Synchronization.ThreadedSend;

import java.util.Scanner;

/**
 * Created by timmanas on 2017-08-28.
 */
public class ProducerConsumer {

    //region Members

    //endregion

    //region Helpers
    public void produce() throws InterruptedException {

        synchronized (this) {
            System.out.println("Produce Thread Running :: ");

            wait();                                             // Release the lock on shared resource

            // Waits till other method invokes notify
            System.out.println("Produce Thread Resumed");

        }
    }

    public void consume() throws InterruptedException {

        Thread.sleep(1000);
        Scanner scannerObject = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Consume Thread Running :: ");

            System.out.println("Waiting for return key ");
            scannerObject.nextLine();
            System.out.println("Return Key Pressed");

            notify();                               // Notifies the produce thread which called the wait
            Thread.sleep(1000);

        }

    }
    //endregion

}
