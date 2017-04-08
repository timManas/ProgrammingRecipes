package DesignPatterns.Structural.Adapter;

/**
 * Created by timmanas on 2017-04-07.
 */
public class AdapterDesignPattern {

    public static void main(String[] args){
        System.out.println("Adapter Design Pattern");
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

    }


}


/**

 Adapter Design Pattern

 What ?
 - Structural
 - Works as bridge between two incompatible interfaces
 - Create an "Adapter / Wrapper" class which connects the two interfaces


 Why ?
 - Because Legacy code =( - We do not want to change the client code so we create abstract classes which connect different interfaces

 When ?
 - When we have a mismatch of requirements

 Notes
 - Notice that the Adapter Wrapper classes have a reference to the other interface
 - Adapters lets classes work together that could not otherwise work due to incompatible interfaces
 - Normally use it for Third party libraries and frameworks.

 How much should Adapter do ?
 - If the Target and Adaptee are similar -> Adapter class should just delegate the specific request
 - If the Target and Adaptee are completely different -> Adapter needs to convert the data structures and operations required by the Target not implemented in the Adaptee


 References
 https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm

 */

