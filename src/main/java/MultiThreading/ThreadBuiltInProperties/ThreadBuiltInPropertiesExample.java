package MultiThreading.ThreadBuiltInProperties;

/**
 * Created by timmanas on 2018-07-23.
 */
public class ThreadBuiltInPropertiesExample {

    //region Members

    //endregion

    //region Main
    public static void main(String args[]) throws InterruptedException {

        Thread thread1 = new Thread();
        thread1.setName("NewThread1");
        thread1.setPriority(Thread.MAX_PRIORITY);

        Thread thread2 = new Thread();
        thread1.setName("NewThread2");
        thread1.setPriority(Thread.MAX_PRIORITY);

        Thread thread3 = new Thread();
        thread1.setName("NewThread3");
        thread1.setPriority(Thread.MAX_PRIORITY);

        // Start the Thread
        thread1.start();
        thread2.start();
        thread3.start();

        // Fetch the Thread ID
        long id = thread1.getId();
        System.out.println("id: " + id);

        // Fetch the ThreadName
        String name = thread1.getName();
        System.out.println("name: " + name);


        // Fetch the Priority of Thread
        int priority = thread1.getPriority();
        System.out.println("Priorirty: " + priority);

        // Check if Thread is Alive
        boolean isAlive1 = thread1.isAlive();
        System.out.println("IsAlive: " + isAlive1);


        // Fetch the State of the Thread
        Thread.State state = thread1.getState();
        System.out.print("State: " + state);

        thread2.join();


        // Fetch

    }
    //endregion

    //region Helper

    //endregion


}

/**




 */
