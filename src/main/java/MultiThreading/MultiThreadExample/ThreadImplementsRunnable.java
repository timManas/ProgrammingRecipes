package MultiThreading.MultiThreadExample;

/**
 * Created by timmanas on 2017-08-16.
 */
public class ThreadImplementsRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Implemented - Thread: " + Thread.currentThread().getId() + " is Running");
    }
}
