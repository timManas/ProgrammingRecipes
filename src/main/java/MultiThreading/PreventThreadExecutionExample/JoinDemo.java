package MultiThreading.PreventThreadExecutionExample;

/**
 * Created by timmanas on 2017-08-28.
 */
public class JoinDemo implements Runnable {

    //region Helper
    @Override
    public void run() {
        Thread childThread = Thread.currentThread();
        System.out.println("Current Thread: " + childThread.getName());

        System.out.println("Is current thread still alive ? " + childThread.isAlive());

    }

    //endregion
}
