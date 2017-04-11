package DesignPatterns.Structural.Proxy;

/**
 * Created by timmanas on 2017-04-10.
 */
public class ProxyDesignPattern {

    public static void main(String [] args){
        System.out.println("::: Proxy Design Pattern :::");

        System.out.println("Image will be loaded from disk");
        Image image = new ProxyImage("GrumpyCar.png");
        image.display();

        System.out.println("Image will NOT be loaded from disk");
        image.display();

    }
}

/**

 Proxy Design Pattern

 What ?
 - Structural
 - A class represents functionality of another class
 - Essentially it is a wrapper called by the client to access the real object behind the scenes
 - Ex. Money vs Creditcard. You can treat credit card like a proxy since it represents money

 Why ?
 - Add security access to an exisiting object
 - Provide an interface for modifiying behaviour
 

 When ?
 - We do not want the client to modify the original object but allow communication and modified behaviour using a proxt

 Notes
 - THey keep a reference to the "Real" object. This is done for communication


 Referenes
 https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm

 */