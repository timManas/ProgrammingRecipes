package MultiThreading.CyclicBarrierThreadExample;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by timmanas on 2018-07-24.
 */
public class CyclicBarrierExample implements Runnable {

    // 3 represents the Number of Threads
    private static int numOfThreads = 2;
    public static CyclicBarrier cyclicBarrier = new CyclicBarrier(numOfThreads);


    //region Main
    public static void main(String args[]) {

        CyclicBarrierExample cyclicBarrierTest = new CyclicBarrierExample();
        Thread thread1 = new Thread(cyclicBarrierTest);
        thread1.start();

    }

    @Override
    public void run() {

        System.out.println("Number of parties required to trip the barrier: " + cyclicBarrier.getParties());
        System.out.println("BeforeStart: Sum of both computations: " + (Computation1.product  + Computation2.product));

        Computation1 computation1 = new Computation1();
        Computation2 computation2 = new Computation2();

        Thread thread1 = new Thread(computation1);
        Thread thread2 = new Thread(computation2);

        thread1.start();
        thread2.start();


        try {
            CyclicBarrierExample.cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        System.out.println("AfterStart: Sum of both computations: " + (Computation1.product  + Computation2.product));
        cyclicBarrier.reset();

        System.out.println("Barrier reset successful");

    }
    //endregion

}

class Computation1 implements Runnable {

    //region Member
    public static int product = 0;
    //endregion

    @Override
    public void run() {
        Random random = new Random();
        product = random.nextInt(1000);

        System.out.println("Random Number in ComputationRun1: " + product);

        try {
            CyclicBarrierExample.cyclicBarrier.await(3000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }
}

class Computation2 implements Runnable{

    //region Member
    public static int product = 0;
    //endregion

    @Override
    public void run() {

        System.out.println("Check if Barrier is Broken: " + CyclicBarrierExample.cyclicBarrier.isBroken());
        Random random = new Random();
        product = random.nextInt(1000);

        System.out.println("Random Number in ComputationRun2: " + product);

        try {
            CyclicBarrierExample.cyclicBarrier.await(3000, TimeUnit.MILLISECONDS);
            System.out.print("Number of parties waiting: " + CyclicBarrierExample.cyclicBarrier.getNumberWaiting());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }


    }
}

/**
 Cyclic Barrier

 What ?
 - Cyclic barrier is used to make threads wait for each other.
 - You can assign different task to multiple threads and perform each one which combine together in the parent thread
 - Multiple threads carry out different sub task and the output of these subtask need to be combined to form the final output


 Why ?


 How ?
 - Once the total number of threads equal to the totalNumberOfThreads, the barrier opens up


 Notes
 - When a sub thread finishes, it calls await() method and wait for other threads to reach the barrier
 - Once all the thread reach barrier, the barriers give the way for the thread to proceed
 - If you place numOfThreads != 3, error will occur

 Difference between a Cyclic Barrier and a countdown latch ?
 - CB can be used multiple times once all threads in barriers have been released


 */