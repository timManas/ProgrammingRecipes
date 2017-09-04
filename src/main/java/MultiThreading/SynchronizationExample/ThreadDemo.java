package MultiThreading.SynchronizationExample;

import Misc.Synchronization.ThreadedSend;

/**
 * Created by timmanas on 2017-08-30.
 */
public class ThreadDemo extends Thread {

    //region Members
    private Thread thread;
    private String threadName;
    private PrintDemo printDemo;
    //endregion

    //region Constructor
    public ThreadDemo(String name, PrintDemo pd) {
        threadName = name;
        printDemo = pd;
    }

    //endregion

    //region Helpers

    public void start() {
        System.out.println("Starting: " + threadName);
        if(thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }

    public void run() {

        // Synchronized block
        synchronized (printDemo) {
            printDemo.printCount();
        }

        System.out.println("Exiting: " + threadName);

    }

    //endregion
}
