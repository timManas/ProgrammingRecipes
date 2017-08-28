package MultiThreading.MultiThreadExample;

import Misc.Synchronization.ThreadedSend;

/**
 * Created by timmanas on 2017-08-16.
 */
public class ThreadExtended extends Thread{

    //region Helpers
    public void run (){
        System.out.println("Extended - Thread: " + Thread.currentThread().getId() + " is Running");
    }
    //endregion

}
