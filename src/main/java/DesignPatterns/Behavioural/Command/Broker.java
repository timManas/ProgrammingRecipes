package DesignPatterns.Behavioural.Command;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timmanas on 2017-04-12.
 */
public class Broker {

    public List<Order> orderList = new ArrayList<>();

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
