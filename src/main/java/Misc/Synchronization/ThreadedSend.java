package Misc.Synchronization;

/**
 * Created by timmanas on 2017-04-22.
 */
public class ThreadedSend extends Thread {

    private String message;
    private Thread thread;
    Sender sender;

    public ThreadedSend(String message, Sender sender) {
        this.message = message;
        this.sender = sender;
    }

    public void run() {
        synchronized (sender) {
            sender.send(message);
        }
    }
}
