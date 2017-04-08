package DesignPatterns.Structural.Adapter;

/**
 * Created by timmanas on 2017-04-08.
 */
public class VLCPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing VLC: " + fileName);
    }

    @Override
    public void playMP4(String fileName) {

    }


}
