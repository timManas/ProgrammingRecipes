package DesignPatterns.Structural.Proxy;

/**
 * Created by timmanas on 2017-04-10.
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk();
    }


    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public void display() {
        System.out.println("Displaying Real Image FileName: " + fileName);
    }

    public void loadFromDisk(){
        System.out.println("Loading From Disk of Real Image FileName: " + fileName);
    }
}
