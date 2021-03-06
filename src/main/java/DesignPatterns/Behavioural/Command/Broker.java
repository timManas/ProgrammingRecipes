package DesignPatterns.Behavioural.Command;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by timmanas on 2017-04-12.
 */
public class Broker {

    public List<Order> orderList = new ArrayList<>();       // This is the requests accepted by the broker object

    public void takeOrders(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for(Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }

}
