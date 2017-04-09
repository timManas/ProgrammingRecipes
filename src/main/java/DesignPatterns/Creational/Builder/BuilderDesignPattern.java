package DesignPatterns.Creational.Builder;

/**
 * Created by timmanas on 2017-04-08.
 */
public class BuilderDesignPattern {

    public static void main(String[] args){
        System.out.println("::: Builder Design Pattern :::");
        MealBuilder mealBuilder = new MealBuilder();

        System.out.println("Vegetarian Meal");
        Meal vegetarianMeal = mealBuilder.prepareVegMeal();
        vegetarianMeal.showItems();
        System.out.println("Cost: " + vegetarianMeal.getCost());

        System.out.println("Chicken Meal");
        Meal meatMeal = mealBuilder.prepareNonVegMeal();
        meatMeal.showItems();
        System.out.println("Cost: " + meatMeal.getCost());

    }
}


/**
 *
 Builder Design Pattern

 What ?
 - Creational
 - Builds complex objects using a Step by Step approach
 - Allows encapsulation

 Why ?
 - Allows user to customize the object they wish to build

 When ?
 - When you need to build an object made of several mini objects which the client can customize
 - When there are alot of objects involved in building the complex object

 Notes
 - Builder returns the product as a final step, while Abstract returns the product immediately
 - Builder often use a composite

 */