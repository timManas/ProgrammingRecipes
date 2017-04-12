package DesignPatterns.Behavioural.Command;

/**
 * Created by timmanas on 2017-04-12.
 */
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }


}
