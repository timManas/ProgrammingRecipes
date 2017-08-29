package MultiThreading.ThreadPriorityExample;

/**
 * Created by timmanas on 2017-08-29.
 */
public class ThreadDemo extends Thread {

    //region Helper
    public void run() {
        System.out.println("Thread in Control: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        System.out.println("II. Thread in Control: " + Thread.currentThread().getName());
    }
    //endregion

}
