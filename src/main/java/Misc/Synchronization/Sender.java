package Misc.Synchronization;

/**
 * Created by timmanas on 2017-04-22.
 */
public class Sender {

    public void send(String msg) {

        System.out.println("Sending\t " + msg);
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Thread interrupted");
        }
        System.out.println("\nMessage: " + msg);
    }

}
