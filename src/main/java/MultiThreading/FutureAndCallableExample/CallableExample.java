package MultiThreading.FutureAndCallableExample;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * Created by timmanas on 2018-07-24.
 */
public class CallableExample implements Callable {
    @Override
    public Object call() throws Exception {
        Random random = new Random();
        Integer randomInteger = random.nextInt(10000);

        System.out.print("RandomInteger: " + randomInteger);

        return randomInteger;

    }
}
