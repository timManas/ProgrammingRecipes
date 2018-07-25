package MultiThreading.InterThreadCommunication;

/**
 * Created by timmanas on 2017-08-28.
 */
public class InterThreadCommunicationExample {

    public static void main(String args []) {

        ProducerConsumer pcObject = new ProducerConsumer();

        Thread produceThread = new Thread(() -> {
            try {
                pcObject.produce();
            } catch (InterruptedException e) {

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

 How this program works
 - In the main class a new PC object is created.
 - It runs produce and consume methods of PC object using two different threads namely t1 and t2 and wait for these threads to finish.

 Lets understand how our produce and consume method works.

 - First of all, use of synchronized block ensures that only one thread at a time runs.
 Also since there is a sleep method just at the beginning of consume loop, the produce thread gets a kickstart.

 - When the wait is called in produce method, it does two things.
 Firstly it releases the lock it holds on PC object.
 Secondly it makes the produce thread to go on a waiting state until all other threads have terminated, that is it can again acquire a lock on PC object and some other method wakes it up by invoking notify or notifyAll on the same object.
 Therefore we see that as soon as wait is called, the control transfers to consume thread and it prints -“Waiting for return key”.

 - After we press the return key, consume method invokes notify().
 It also does 2 things:
 1. Unlike wait(), it does not releases the lock on shared resource therefore for getting the desired result,
 it is advised to use notify only at the end of your method.
 2. It notifies the waiting threads that now they can wake up but only after the current method terminates.

 - As you might have observed that even after notifying, the control does not immediately passes over to the produce thread.
 The reason for it being that we have called Thread.sleep() after notify().
 As we already know that the consume thread is holding a lock on PC object, another thread cannot access it until it has released the lock.
 Hence only after the consume thread finishes its sleep time and thereafter terminates by itself, the produce thread cannot take back the control.
 After a 2 second pause, the program terminates to its completion.


 */
