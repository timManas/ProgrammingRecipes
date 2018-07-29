package MultiThreading.FutureAndCallableExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by timmanas on 2018-07-24.
 */
public class CallableFutureExample {

    //region Main
    public static void main(String args[]) {

        // Future task is a concrete class which implements both Runnable and Future
        FutureTask[] randomNumberTasks = new FutureTask[5];

        for(int index=0; index < randomNumberTasks.length; index++) {

            // Create a callable which stores the value
            Callable callable = new CallableExample();

            // Store the random number in FutureTask Array
            randomNumberTasks[index] = new FutureTask(callable);


            // Create a thread with Runnable which executes the thread
            Thread thread = new Thread(randomNumberTasks[index]);
            thread.start();
        }


        // Display the values of Array of Future Tasks
        for(int index=0; index < randomNumberTasks.length; index++) {
            try {
                System.out.println(randomNumberTasks[index].get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }


    }

    //endregion

}


/**

 Callable

 What ?
 - Callable allows us to get the value when we execute a thread.

 Why  ?
 - Because when you execute a Runnable (i.e run()), we cannot get the value of the sub thread which just ran

 How ?


 Callable vs Runnable ?
 - For implementing a Runnable, a run() is required to be implemented which does NOT return anytthing
 - For implementing a Callable, a call() is required to be implementred which returns the result of the completion.


 Future

 What ?
 - Stores a value which may be known in the future ... It may not be now, but definitely later
 - Allows the main thread to keep track of the results of multiple threads



 Note
 - A thread cannot be created with Callable, only a runnable.
 - To obtain the result, a Callable is required
 - Callale is similar to Runnable - it encapsulates a task which is required to run in a seperate thread
 - Future is used to store a value obtained from another thread.
 - THERE IS NO DIRECT WAY TO CREATE A THREAD WITH A CALLABLE




 */