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
 Builder Design Pattern .... i.e  "Customizer" Design Pattern

 What ?
 - Creational
 - Builds complex objects using a Step by Step approach
 - Allows encapsulation

 Why ?
 - CUSTOMIZATION
 - Allows user to customize the object they wish to build
 - We want an object which can be customized any way we Wish

 When ?
 - When you need to build an object made of several mini objects which the client can customize
 - When there are alot of objects involved in building the complex object

 Notes
 - Builder returns the product as a final step, while Abstract returns the product immediately
 - Builder often use a composite

 Analogy
 - Think of ordering a meal at McDonalds.
 - We place our meal with the cashier (Builder) and customized our burger, friends, drink
 - The cook prepares the meal and returns back to the cashier who returns it to us

 */