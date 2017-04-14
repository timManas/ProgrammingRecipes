package DesignPatterns.Behavioural.Iterator;

/**
 * Created by timmanas on 2017-04-14.
 */
public class NameIterator implements Iterator {

    int index;
    String [] nameList;

    public NameIterator(String[] name){
        this.nameList = name;
    }

    @Override
    public boolean hasNext() {
        if(index < this.nameList.length)
            return true;

        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext())
            return nameList[index++];

        return null;
    }
}
