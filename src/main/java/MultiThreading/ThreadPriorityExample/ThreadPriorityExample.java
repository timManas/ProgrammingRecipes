package MultiThreading.ThreadPriorityExample;

/**
 * Created by timmanas on 2017-08-29.
 */
public class ThreadPriorityExample {

    //region Members
    public static boolean shouldPrintThreadByPriority = true;
    //endregion

    //region Main

    public static void main(String [] args) {

        ThreadDemo thread1 = new ThreadDemo();
        thread1.setName("Thread1");
        thread1.setPriority(Thread.MIN_PRIORITY);

        ThreadDemo thread7 = new ThreadDemo();
        thread7.setName("Thread7");
        thread7.setPriority(Thread.MAX_PRIORITY);

        ThreadDemo thread2 = new ThreadDemo();
        thread2.setName("Thread2");
        thread2.setPriority(3);

        ThreadDemo thread3 = new ThreadDemo();
        thread3.setName("Thread3");
        thread3.setPriority(Thread.NORM_PRIORITY);

        ThreadDemo thread8 = new ThreadDemo();
        thread8.setName("Thread8");
        thread8.setPriority(Thread.NORM_PRIORITY);

        ThreadDemo thread4 = new ThreadDemo();
        thread4.setName("Thread4");
        thread4.setPriority(10);

        ThreadDemo thread5 = new ThreadDemo();
        thread5.setName("Thread5");
        thread5.setPriority(Thread.MIN_PRIORITY);

        ThreadDemo thread6 = new ThreadDemo();
        thread6.setName("Thread6");
        thread6.setPriority(Thread.MIN_PRIORITY);


        thread1.start();
        thread7.start();
        thread2.start();
        thread3.start();
        thread8.start();
        thread4.start();
        thread5.start();
        thread6.start();



        try {

            if(shouldPrintThreadByPriority) {
                thread1.join();
                thread2.join();
                thread3.join();
                thread4.join();
                thread5.join();
                thread6.join();
                thread7.join();
                thread8.join();
            }

            System.out.println("Is Thread1 alive: " + thread1.isAlive());
            System.out.println("Is Thread2 alive: " + thread2.isAlive());
            System.out.println("Is Thread3 alive: " + thread3.isAlive());
            System.out.println("Is Thread4 alive: " + thread4.isAlive());
            System.out.println("Is Thread5 alive: " + thread5.isAlive());
            System.out.println("Is Thread6 alive: " + thread6.isAlive());
            System.out.println("Is Thread7 alive: " + thread7.isAlive());
            System.out.println("Is Thread8 alive: " + thread8.isAlive());



        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread in Control :: " + Thread.currentThread().getName());


    }

    //endregion

}

/**

 Thread Priority

 What ?
 - Threads can be given a priority depending on the urgency/severity of the problem
 - Has value of 1 - 10
 - The value of 1 is the HIGHEST PRIORITY and Value of 10 is the lowest prority
 - Has three default static variables - MIN_PRIORITY, NORM_PRIORITY & MAX_PRIORITY
 - User can get/set priority value


 Why ?

 Notes
 - If two threads have higher priority, we do not know which one will be executed first. It depends on the thread schedulers algorithm (ex. Round Robin, FIFO, ETC)


 References
 http://www.geeksforgeeks.org/java-thread-priority-multithreading/

 */
