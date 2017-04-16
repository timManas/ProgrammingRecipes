package DesignPatterns.Behavioural.NullObject;

/**
 * Created by timmanas on 2017-04-15.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }
}
