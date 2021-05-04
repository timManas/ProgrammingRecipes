package DesignPatterns.Behavioural.Command;


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
