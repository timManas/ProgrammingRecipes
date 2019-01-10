package MultiThreading.SynchronizationExample;

/**
 * Created by timmanas on 2017-08-30.
 */
public class PrintDemo {

    //region Helpers

    public void printCount(String threadName) {

        for(int i = 0; i < 3; i++ ) {
            System.out.println("ThreadName: " + threadName + "      Counter: " + i);
        }

    }

    //endregion

}
