package DesignPatterns.Behavioural.NullObject;

/**
 * Created by timmanas on 2017-04-15.
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
