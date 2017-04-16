package DesignPatterns.Behavioural.NullObject;

/**
 * Created by timmanas on 2017-04-15.
 */
public class CustomerFactory {

    public static final String[] names = {"Tim", "John", "Manas"};

    public static AbstractCustomer getCustomer(String name) {
        for(String customerName : names){
            if (customerName.equalsIgnoreCase(name))
                return new RealCustomer(name);


        }
        return new NullCustomer();
    }

}
