package DesignPatterns.Behavioural.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timmanas on 2017-04-15.
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();      // Reference to all the memento Objects

    public void add(Memento momento) {
        mementoList.add(momento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

    public List<Memento> getMementoList() {
        return this.mementoList;
    }

}
