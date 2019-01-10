package MultiThreading.SynchronizationExample;

/**
 * Created by timmanas on 2017-08-29.
 */
public class SynchronizedExample {

    public static void main(String [] args) {

        PrintDemo printDemo = new PrintDemo();

        ThreadDemo threadDemo1 = new ThreadDemo("Thread#1", printDemo);
        ThreadDemo threadDemo2 = new ThreadDemo("Thread#2", printDemo);

        threadDemo1.start();
        System.out.println("Main Method: Started Thread1\n");
        threadDemo2.start();
        System.out.println("Main Method: Started Thread2\n");

        try {
            System.out.println("Main Method: Inside Try Statement");
            threadDemo1.join();
            System.out.println("Main Method: Started Thread1 Join\n");

            threadDemo2.join();
            System.out.println("Main Method: Started Thread2 Join\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finished Main");

    }
}

/**

 Synchronization

 What ?
 - Block which only allows ONLY one thread to access the resource at any given time
 - All other threads waiting to access the thread are blocked until the thread inside the synchronized block  exits the block
 - Can be placed inside a method or the method itself can be synchronized

 Why ?


 Notes


 References
 http://www.geeksforgeeks.org/synchronized-in-java/


 */
