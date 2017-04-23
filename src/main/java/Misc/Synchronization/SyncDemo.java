package Misc.Synchronization;

/**
 * Created by timmanas on 2017-04-22.
 */
public class SyncDemo {

    public static void main(String [] args) {
        System.out.println("::: Syncronization Demo :::");

        Sender sender = new Sender();

        ThreadedSend thread1 = new ThreadedSend("Hellow World", sender);
        ThreadedSend thread2 = new ThreadedSend("Tim is the Best", sender);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread has been Interrupted");
        }

    }

}


/**

 Synchronization

 What ?
 - A method block which makes sure that only ONE thread can access the resource at a time
 - Synchronized blocks are marked with "Synchronized" key word
 - The synchronized block is synchronized on some java object.
 - Can only have one thread executing inside them at a time. All other threads are blocked
 
 Notes ?
 - The join() method tells the Thread (i.e thread1 or thread2) to return to the main Thread when finished
 - Thread1 or Thread2 can finish one before the other or simulataneously
 - Thread1 does NOT know anything about Thread2 and vice versa


 */