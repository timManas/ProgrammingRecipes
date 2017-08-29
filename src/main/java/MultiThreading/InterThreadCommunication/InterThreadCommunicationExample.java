package MultiThreading.InterThreadCommunication;

/**
 * Created by timmanas on 2017-08-28.
 */
public class InterThreadCommunicationExample {

    public static void main(String args []) {

        ProducerConsumer pcObject = new ProducerConsumer();

        Thread produceThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pcObject.produce();
                } catch (InterruptedException e) {

                }
            }
        });

        Thread consumeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pcObject.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        produceThread.start();
        consumeThread.start();

        try {
            produceThread.join();
            consumeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

/**

 Inter Thread Communication

 wait()
 - Tells the calling thread to give up the lock & go to sleep
 - This occurs until another thread enters monitor & calls "notify"

 notify()
 - Wakes up a single thread that called wait() on the SAME OBJECT.
 - Note: Calling notify does not actually give up lock on resource

 notifyAll()
 - Wakes up all threads that called wait() on the SAME OBJECT


 */
