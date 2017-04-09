package DesignPatterns.Creational.Builder;

import java.util.ArrayList;

/**
 * Created by timmanas on 2017-04-08.
 */
public class Meal {

    ArrayList<Item> itemsList = new ArrayList<>();

    public void addItems(Item items){
        itemsList.add(items);
    }

    public float getCost(){
        float cost = 0;

        for(Item item : itemsList){
            cost = cost + item.price();
        }

        return cost;
    }

    public void showItems(){
        System.out.println("Item List ---->");
        for(Item item : itemsList){
            System.out.println(item.name());
        }
    }

}
