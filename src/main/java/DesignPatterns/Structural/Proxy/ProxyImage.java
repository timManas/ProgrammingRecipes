package DesignPatterns.Structural.Proxy;

/**
 * Created by timmanas on 2017-04-10.
 */
public class ProxyImage implements Image {

    private RealImage realImage;        // We need to keep a reference to the original object
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {

        if(realImage == null)
            realImage = new RealImage(fileName);

        realImage.display();
    }
}
