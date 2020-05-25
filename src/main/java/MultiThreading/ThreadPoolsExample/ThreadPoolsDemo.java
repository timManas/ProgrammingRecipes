package MultiThreading.ThreadPoolsExample;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolsDemo {

    public static void main(String [] args) {

        /** TRY This: Uncomment between Fixed vs Cache **/
        // CreateDynamic Cache ThreadPool
        int maxNumThreads = 5;
        ExecutorService threadPool = Executors.newCachedThreadPool();


        // Create FIXED size threadPool
//        int maxNumThreads = 7;
//        ExecutorService threadPool = Executors.newFixedThreadPool(maxNumThreads);


        // Create worker threads
        Runnable r1 = new Task("Thread1");
        Runnable r2 = new Task("Thread2");
        Runnable r3 = new Task("Thread3");
        Runnable r4 = new Task("Thread4");
        Runnable r5 = new Task("Thread5");
        Runnable r6 = new Task("Thread6");
        Runnable r7 = new Task("Thread7");


        // Start Executing the Threads
        System.out.println("Starting Thread1\n");
        threadPool.execute(r1);

        System.out.println("Starting Thread2\n");
        threadPool.execute(r2);

        System.out.println("Starting Thread3\n");
        threadPool.execute(r3);

        System.out.println("Starting Thread4\n");
        threadPool.execute(r4);

        System.out.println("Starting Thread5\n");
        threadPool.execute(r5);

        System.out.println("Starting Thread6\n");
        threadPool.execute(r6);

        System.out.println("Starting Thread7\n");
        threadPool.execute(r7);


        // Shutdown the pool

        threadPool.shutdown();
        System.out.println("Finished Main Thread");
    }

}

class Task implements Runnable {

    public Task(String threadName) {
        Thread.currentThread().setName(threadName);
    }

    @Override
    public void run() {

        System.out.println("Starting Thread: " + Thread.currentThread().getName());
        for (int i=0; i < 3; i++) {
            try {
                System.out.println("Current ThreadRunning: " + Thread.currentThread().getName());
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finished Thread: " + Thread.currentThread().getName() + "\n");

    }
}


/**
 What ?
 - ThreadPool is a pool of threads.
 - Once one thread in the pool is finished, the pool will reuse a thread to run the worker application

 Why ?
 - Prevent memory leaks
 - Reuse as much as thread as possible

 How ?
 - Create a ThreadPool using FIXED or Dynamic Cached
 - Run Threadpool
 - Shutdown Threadpools

 Note:
 1. You can use a Fixed Size thred pool
 Executors.newFixedThreadPool(maxNumThreads);

 2. Or you can use a dynamic threadpool, which creates threads as needed but will reuse threads when they are available
 Executors.newFixedThreadPool(maxNumThreads);

 */