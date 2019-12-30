package MultiThreading.NotifyExample;

import DesignPatterns.Behavioural.State.StartState;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by timmanas on 2017-04-22.
 */
public class ObjectDemo extends Object {

    private List synchronizedList;

    public ObjectDemo() {
        synchronizedList = Collections.synchronizedList(new LinkedList());
    }

    public static void main(String [] args) {
        System.out.println("::: Notify() / NotifyAll() Demo :::");

        final ObjectDemo demo = new ObjectDemo();
        Runnable runA = () -> {
            try{
                String item = demo.removeElement();
                System.out.println("Removed Item: " + item );
            }catch (Exception e) {
                e.printStackTrace();
            }

        };

        Runnable runB = new Runnable() {
            @Override
            public void run() {
                demo.addElement("Hello");
            }
        };

        try{

            Thread threadA1 = new Thread(runA, "Thread-A");
            System.out.println("Starting Thread A");
            threadA1.start();

            Thread.sleep(500);

//            Thread threadA2 = new Thread(runA, "Thread-A2");
//            threadA2.start();

            Thread.sleep(500);

            Thread threadB = new Thread(runB, "Thread-B");
            System.out.println("Starting Thread B");
            threadB.start();

            Thread.sleep(1000);

            System.out.println("ThreadA1 Interupt");
            threadA1.interrupt();
//            threadA2.interrupt();

            System.out.println("ThreadB Interupt");
            threadB.interrupt();



        }catch (Exception e){

        }
    }

    private String removeElement() throws InterruptedException {

        synchronized (synchronizedList){
            System.out.println("Thread in Charge :: " + Thread.currentThread().getName());

            while (synchronizedList.isEmpty()){
                System.out.println("List is Empty ....");
                synchronizedList.wait();
                System.out.println("Waiting....In removeElement()");
            }
            String element = (String) synchronizedList.remove(0);

            return element;
        }

    }

    private void addElement(String element) {
        System.out.println("\nOpening ...");

        synchronized (synchronizedList) {

            synchronizedList.add(element);
            System.out.println("New Element: " + element);

            synchronizedList.notifyAll();
            System.out.println("\nNotifAll has been called");
        }

        System.out.println("Closing ...");

    }
}
