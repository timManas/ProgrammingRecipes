package DesignPatterns.Behavioural.Strategy;

/**
 * Created by timmanas on 2017-04-18.
 */
public class StrategyDesignPattern {

    public static void main(String [] args) {
        System.out.println("::: Strategy Design Pattern :::");

        Context context = new Context(new OperationAdd());
        System.out.println("5 + 5  = " + context.executeStrategy(5,5));

        context = new Context(new OperationMultiply());
        System.out.println("5 * 5 = " + context.executeStrategy(5,5));


    }
}


/**

 Strategy Design Pattern

 What ?
 - Behavioural
 - Object behaviour can change at run time.
 - We create various objects which represent various strategies a context object whos behaviour changes as per its strategy object


 Why ?
 - We have various algorithms which need to performed on the same object
 - Algorithm can vary independetly from the clients which use it

 When ?
 - We have a family of algorithms
 - Algorithms need to be interchangeable for that object  

 Notes
 - Notice that strategy lets you change the guts of the object but decorator lets you change the skin of the object
 - Strategy is bind once pattern vs State which is more dynamic since state can change at anytime

 References
 https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm

 */