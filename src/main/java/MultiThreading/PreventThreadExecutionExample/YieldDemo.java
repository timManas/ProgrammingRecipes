package MultiThreading.PreventThreadExecutionExample;

import Misc.Synchronization.ThreadedSend;

/**
 * Created by timmanas on 2017-08-28.
 */
public class YieldDemo extends Thread{

    //region Helpers
    public void run() {
        System.out.println("In YieldDemo");
        for(int i = 0; i < 5; i++) {
            System.out.println("Thread in Control: " + Thread.currentThread().getName());
        }
    }
    //endregion

}
