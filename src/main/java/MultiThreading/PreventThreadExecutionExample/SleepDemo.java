package MultiThreading.PreventThreadExecutionExample;

/**
 * Created by timmanas on 2017-08-28.
 */
public class SleepDemo extends Thread {

    //region Helper
    private Thread threadElement;
    //endregion

    //region Helper
    public void run() {

        threadElement = Thread.currentThread();

        for(int i = 0; i < 3; i++) {
            System.out.println("In SleepDemoThread :: " + threadElement.currentThread().getName());
            try {
                threadElement.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    //endregion
}
