package DesignPatterns.Structural.Adapter;

/**
 * Created by timmanas on 2017-04-08.
 */
public class MP4Player implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {

    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4: " + fileName);
    }
}
