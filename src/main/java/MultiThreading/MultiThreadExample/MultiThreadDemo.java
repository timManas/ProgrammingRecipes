package MultiThreading.MultiThreadExample;

/**
 * Created by timmanas on 2017-08-16.
 */
public class MultiThreadDemo {

    //region Members

    //endregion

    //region Main
    public static void main(String [] args) {

        // Creating a thread by Extending the Thread Class
        for(int i = 0; i < 10; i++) {
            ThreadExtended thread = new ThreadExtended();
            thread.start();
        }

        // Creating a thread by Implementing the Runnable Interface
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new ThreadImplementsRunnable());
            thread.start();
        }

        // Yield Example


        // Sleep Example

        // Join Example

    }
    //endregion

    //region Helpers

    //endregion
}


/**
    Multi Threading Example

    What ?
    - Multithreaded allows parallel execution of mutliple threads
    - Threads are light-weight processes
    - Two ways to create a thread
            - Extending the Thread Class
            - Implementing the Runnable Interface

    Why ?
    - To boost performance by maximizing the capabilities of the CPU

    Notes
    - When you extend a Thread class, you cannot extend any other class  since Java does not support multiple inheritance
      But if we implement the Runnable interface, we can still extend other classes
    - Both will require you to override the run() method

    References
    - http://www.geeksforgeeks.org/multithreading-in-java/


 */