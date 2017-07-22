package DesignPatterns.Behavioural.Command;

/**
 * Created by timmanas on 2017-04-12.
 */
public class CommandDesignPattern {

    public static void main(String [] args){

        System.out.println("::: Command Design Pattern :::");

        Stock googleStock = new Stock("Google", 10);
        Stock facebookStock = new Stock("Facebook", 50);

        BuyStock buyStockOrder = new BuyStock(googleStock);
        SellStock sellStockOrder = new SellStock(googleStock);

        BuyStock buyFacebookStockOrder = new BuyStock(facebookStock);
        SellStock sellFacebookStockOrder = new SellStock(facebookStock);

        Broker broker = new Broker();

        broker.takeOrders(buyStockOrder);
        broker.takeOrders(sellStockOrder);
        broker.takeOrders(buyFacebookStockOrder);
        broker.takeOrders(sellFacebookStockOrder);

        broker.placeOrders();

    }
}

/**

 Command Design Pattern ... i.e "Fruit Basket" / Single Object with multiple request

 What ?
 - Behavioural
 - Encapsulate a request as an Object, each with it's own customization (ex. Printing Paper Colour, size, Formatt)

 Why ?
 - Allows you to you group request together for clients
 - Allows requested to be set up as a queue to be performed sequentially
 
 When ?
 - When we have alot of requests to be made sequentially

 Notes
 - Notice that "Broker" has to receive the same Object (Order) which can be composed of multiple requests

 Reference
 https://www.tutorialspoint.com/design_pattern/command_pattern.htm

 */
