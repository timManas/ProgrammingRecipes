package MultiThreading.CountDownLatchDemo;


import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

    public static void main(String [] args) throws InterruptedException {

        // Step1 - Create a new countdown latch
        CountDownLatch latch = new CountDownLatch(4);

        // Step2 - Create worker Threads
        Worker worker1 = new Worker(1000, latch, "Worker1");
        Worker worker2 = new Worker(2000, latch, "Worker2");
        Worker worker3 = new Worker(3000, latch, "Worker3");
        Worker worker4 = new Worker(4000, latch, "Worker4");


        // Step3 - Start the worker threads
        System.out.println("Thread Worker1 starting");
        worker1.start();
        System.out.println("Thread Worker2 starting");
        worker2.start();
        System.out.println("Thread Worker3 starting");
        worker3.start();
        System.out.println("Thread Worker4 starting");
        worker4.start();


        // Step4 - Main thread awaits until ALL four threads finish
        latch.await();

        // Step5 - All threads finished and now resumes main thread
        System.out.println("Current Thread Running: " + Thread.currentThread().getName());

    }


}


class Worker extends Thread{

    private int delay;
    private CountDownLatch latch;

    // Constructor
    public Worker(int delay, CountDownLatch latch, String threadName) {
        super(threadName);
        this.delay = delay;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println("Running Thread: " + Thread.currentThread().getName() + "\n");
            Thread.sleep(delay);
            latch.countDown();
            System.out.println("Latch Count: " + latch.getCount());
            System.out.println("Finished Thread: " + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


/**
 What ?
 - Countdown latch is the "FINAL COUNTDOWN .. DUN DUN DUN ... DUN DUN DUN DUN DUN"
 - Waits for other (worker) threads to finish running and finally allows main thread to run
 - Everytime a worker thread finishes running, the latch.countdown() decremements count
 - Once count reaches zero, the main thread starts running

 Why ?
 - A much simpler version of a Cyclic Barrier

 When ?
 - Useful when we NEED to wait for other threads to finish before we can start curret thread
 - Ex: Waiting for DB to finish connecting so we can load the main page for a website


 */