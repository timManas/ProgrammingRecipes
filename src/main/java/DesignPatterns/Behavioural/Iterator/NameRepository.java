package DesignPatterns.Behavioural.Iterator;

/**
 * Created by timmanas on 2017-04-14.
 */
public class NameRepository implements Container {

    private String name [] = {"Tim", "John", "Manas"};

    @Override
    public Iterator getIterator() {
        return new NameIterator(name);
    }
}
