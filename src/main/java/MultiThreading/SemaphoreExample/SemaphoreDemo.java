package MultiThreading.SemaphoreExample;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    public static void main(String [] args) throws InterruptedException {

        int numPermits = 1;
        Semaphore semaphore = new Semaphore(numPermits);

        MyThread thread1 = new MyThread(semaphore, "Thread1");
        MyThread thread2 = new MyThread(semaphore, "Thread2");

        // Start Thread1 and Thread2
        thread1.start();
        thread2.start();

        // Wait for thread A and ThreadB
        thread1.join();
        thread2.join();

        System.out.println("Count: " + Shared.count);
    }
}


//region Classes

class Shared {
    static int count = 0;
}

class MyThread extends Thread {

    private Semaphore sem;
    private String threadName;

    public MyThread(Semaphore semaphore, String threadName) {
        super(threadName);
        this.sem = semaphore;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        super.run();

        // If Threadname is Thread1
        if (threadName.equalsIgnoreCase("Thread1")) {
            System.out.println("Starting: " + threadName);

            try {
                System.out.println(threadName + " waiting for a permit");
                // Acquire Permit
                sem.acquire();
                System.out.println(threadName + " gets Permit");

                // Access Shared Resource
                for (int i=0; i < 5; i++) {
                    Shared.count++;
                    System.out.println(threadName + ": " + Shared.count);

                    // Thread.sleep should make this thread sleep for 10 seconds... which would let thread2 start
                    // However, since we are using semaphore, the permit is still with Thread1 so it does NOT release it until we call sem.release()
                    Thread.sleep(10);
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Release Permit
            System.out.println(threadName + " releases Permit");
            sem.release();

            return;
        }

        // If Threadname is Thread2
        System.out.println("Starting: " + threadName);

        try {
            System.out.println(threadName + "waiting for Permit");
            // Acquire the permit
            sem.acquire();
            System.out.println(threadName + " gets Permit");

            for (int i=Shared.count; i > 0; i--) {
                Shared.count--;
                System.out.println(threadName + ": " + Shared.count);

                // Thread.sleep should make this thread sleep for 10 seconds... which would let thread2 start
                // However, since we are using semaphore, the permit is still with Thread1 so it does NOT release it until we call sem.release()
                Thread.sleep(10);
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sem.release();

    }
}

//endregion


/**
 What ?
 - Semaphore control access to a shared resource through the user of a counter
 - If counter is greater than zero, access is allowed
 - If zero, access is denied

 What is the counter counting ?
 - Counter is counting the permits that allow access to the shared resource
 - Therefore, in order to access a resource the thread must be granetd a permit from the SEPHAMORE

 Internal Working of a Semaphore
 - If counter is greater, thread acquires permit from Semaphore
    > This causes Semaphore count to be decremented
 - Otherwise, thread will be cock blocked until a permit is given by the Semaphore
 - When thread no longer needs the permit, it releases the permit
    > This causes Semaphore count to increment again
 - Then the next thread will be given the permit by the Semaphore and the whole process starts again

 Why use a Semaphore ?
 - Both threads would access the resource simulatoneously and shared resource is no longer synchronized
 

 Notes:
 - Notice we have thread.sleep() inside the run ?
    Why ? Thread.sleep should pause current thread and allow the next thread to start. However
            Since the permit is STILL with current thread, the next thread CANNOT Proceed due to the semaphore
            In order for the second thread to proceed, the current thread needs to release the permit
            which then the Semaphore will give permit to next thread to start.


 */
