package MultiThreading.CyclicBarrierEx2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    // Private Variables
    private CyclicBarrier cyclicBarrier;
    private List<List<Integer>> partialResults = Collections.synchronizedList(new ArrayList<>());
    private Random random = new Random();
    private int NUM_PARTIAL_RESULTS;
    private int NUM_WORKERS;

    public static void main(String [] args) {
        CyclicBarrierDemo cyclicBarrierDemo = new CyclicBarrierDemo();
        cyclicBarrierDemo.runSimulations(5, 3);
    }

    private void runSimulations(int numWorkers, int numPartialResults) {
        this.NUM_WORKERS = numWorkers;
        this.NUM_PARTIAL_RESULTS = numPartialResults;

        cyclicBarrier = new CyclicBarrier(NUM_WORKERS, new AggregatorThread());     // Aggregator thread created here

        System.out.println("Creating " + NUM_WORKERS + " worker threads to compute " + NUM_PARTIAL_RESULTS + " partial results each");

        // Spawn off multiple Worker threads
        for (int i=0;  i < NUM_WORKERS; i++) {
            Thread worker = new Thread(new NumberCruncherThread());             // NumberCruncher Thread created here
            worker.setName("Thread " + i);
            worker.start();
        }

    }


    public class NumberCruncherThread implements  Runnable{


        @Override
        public void run() {

            String thisThreadName = Thread.currentThread().getName();
            List<Integer> tempList = new ArrayList<>();

            // Create numbers and store in partial Results List
            for (int i=0; i < NUM_PARTIAL_RESULTS; i++) {
                Integer num = random.nextInt(10);
                System.out.println(thisThreadName + " : Crunching numbers  ... " + num);
                tempList.add(num);
            }

            partialResults.add(tempList);
            System.out.println(thisThreadName + ":  Waiting for other threads to reach barrier");

            // We set a pause on the Cycle Barrier if NOT yet triggered
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }


    // This THREAD Object gets executed ONCE  the Barrier has reached its max # of threads
    public class AggregatorThread implements Runnable {

        @Override
        public void run() {
            System.out.println("\nCyclic Barrier Can Now Proceed");
            String thisThreadName = Thread.currentThread().getName();
            System.out.println(thisThreadName + ": Computing sum of " + NUM_WORKERS + " workers, having " + NUM_PARTIAL_RESULTS + " results each.");

            int sum = 0;
            for (List<Integer> threadResult : partialResults) {
                System.out.println("Adding: ");

                for (int i : threadResult) {
                    System.out.println(i + " ");
                    sum += i;
                }
                System.out.println();
            }

            System.out.println("Total: " + sum);
        }
    }
}

/**
 What ?
 - It is a synchronizer
 - It is cyclic because it can be reused after threads have been released

 When ?
 - Used in programs with fixed # of threads that MUST wait for each other to reach a common point before proceeding

 How ?
 - Create a cyclic barrier object using
 CyclicBarrier cb = new CyclicBarrier(int parties, Runnable barrierAction)
 - Once the # of threads have been reached ... 'barrierAction.run()' now executes
 - This has logic that would be run by the last thread that trips the barrier
 - When we call await(), we register that a thread has reached the barrier


 */
