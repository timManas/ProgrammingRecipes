package DesignPatterns.Structural.Adapter;

/**
 * Created by timmanas on 2017-04-08.
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    public AudioPlayer(){

    }

    public void play(String audioType, String fileName) {

        switch(audioType){

            case "mp3":{
                System.out.println("Now playing MP3 song: " + fileName);
                break;
            }

            case "mp4":
            case "vlc":{
                System.out.println("Using Adapter .... ");
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
                break;
            }

            default:{
                System.out.println("Invalid type: " + fileName);
            }
        }

    }
}
