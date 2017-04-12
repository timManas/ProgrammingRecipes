package DesignPatterns.Behavioural.Command;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by timmanas on 2017-04-12.
 */
public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
