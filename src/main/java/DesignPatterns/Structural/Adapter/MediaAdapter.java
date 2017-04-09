package DesignPatterns.Structural.Adapter;

/**
 * Created by timmanas on 2017-04-08.
 */
public class MediaAdapter implements MediaPlayer {

    public AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){

        if(audioType.equalsIgnoreCase("vlc")){
            this.advancedMediaPlayer = new VLCPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            this.advancedMediaPlayer = new MP4Player();
        }

    }

    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVLC(fileName);
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMP4(fileName);
        }

    }
}
