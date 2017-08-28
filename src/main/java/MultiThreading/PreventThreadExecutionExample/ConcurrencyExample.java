package MultiThreading.PreventThreadExecutionExample;

/**
 * Created by timmanas on 2017-08-28.
 */
public class ConcurrencyExample {

    public static void main (String args []) throws InterruptedException {


        // Yield Example
        System.out.println("=========== yield() Example =========== ");
        YieldDemo yieldDemo = new YieldDemo();
        yieldDemo.start();
        getThreadNameInControl();

        // Notice how child thread always executes first when yield is present
        for(int i = 0; i < 5; i++) {
            // Comment this code will yield unexpected results, since we dont know if the main thread or the child thread is accessing the method
            Thread.yield();                                                                 // Control passes to the child thread
            System.out.println("Thread in Control: " + Thread.currentThread().getName());   // After execution of child thread, main thread takes over
        }

        // Sleep Example
        System.out.println("=========== sleep() Example =========== ");
        System.out.print("\nStarting 1st thread :: ");
        getThreadNameInControl();
        Thread thread1 = new Thread(new SleepDemo());
        thread1.setName("Thread #1");
        thread1.start();
        thread1.join();             // Turn this off ...i dare you
        System.out.println("Is Thread1 still alive ? " + thread1.isAlive());

        System.out.print("\nStarting 2nd thread :: ");
        getThreadNameInControl();
        Thread thread2 = new Thread(new SleepDemo());
        thread2.setName("Thread #2");
        thread2.start();
        thread2.join();             // Turn this off ...i dare you
        System.out.println("Is Thread2 still alive ? " + thread2.isAlive());

        System.out.print("\nStarting 3rd thread :: ");
        getThreadNameInControl();
        Thread thread3 = new Thread(new SleepDemo());
        thread3.setName("Thread #3");
        thread3.start();
        thread3.join();             // Turn this off ...i dare you
        System.out.println("Is Thread3 still alive ? " + thread3.isAlive());

        System.out.print("Finished all Thread creation ");
        getThreadNameInControl();


        // Join Example
        System.out.println("=========== join() Example =========== ");
        Thread joinThread = new Thread(new JoinDemo());
        joinThread.start();

        joinThread.join(1000);
        getThreadNameInControl();
        System.out.println("Is Thread still alive ? " + joinThread.isAlive());


    }
    //region Helper
    private static void getThreadNameInControl() {
        System.out.println("Thread in Control: " + Thread.currentThread().getName());
    }
    //endregion

}

/**

 Java Concurrency methods

 - We can prevent the execution of a thread using one of the following methods ->

 yield()
 - Current thread is not doing anything particularly important
 - If other threads or processes needs to be run, it executes them first. Otherwise the current thread will continue running
 - Tells the thread Scheduler to pause execution of the current thread
 - Thread Scheduler checks if other threads have higher priority which needs to be run and executes them.
 - TLDR: Pause Thread -> Check If other threads have higher priority ? Run those threads : Continue executing current thread

 sleep()
 - TLDR: Cause current thread to sleep for a finite amount of time
 - Causes thread to definitely stop executing for a given amount of time.
 - If no other threads needs to be run, the CPU will be idle


 join()
 - TLDR: Joins two threads in series. The second thread will not start until the first thread finishes
 - You can assign time in milliseconds which waits for the thread to die. A value of "0" will wait forever


 Notes
 - Output may vary from machine to machine
 - In yield ... the main thread is always being paused for its child threads

 References
 http://www.geeksforgeeks.org/java-concurrency-yield-sleep-and-join-methods/



 */
