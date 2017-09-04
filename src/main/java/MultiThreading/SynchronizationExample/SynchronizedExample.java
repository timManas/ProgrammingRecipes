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
        threadDemo2.start();

        try {
            threadDemo1.join();
            threadDemo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


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
