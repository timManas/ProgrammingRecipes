package DesignPatterns.Behavioural.Command;

/**
 * Created by timmanas on 2017-04-12.
 */
public class Stock {

    private String name;
    private int quantity;

    public Stock(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }


    public void buy(){
        System.out.println("Buying Stock: " + name + "  " + "Quantity: " + quantity);
    }

    public void sell(){
        System.out.println("Selling Stock: " + name + "  " + "Quantity: " + quantity);
    }

}
