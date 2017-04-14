package DesignPatterns.Behavioural.Interpreter;

/**
 * Created by timmanas on 2017-04-14.
 */
public class InterpreterDesignPattern {


    public static void main(String[] args){
        System.out.println("::: Interpreter Design Pattern :::");

        Expression maleExpression = getMaleExpression();
        Expression femaleExpression = getMarriedWomenExpression();

        System.out.println("Tim is a male ? " + maleExpression.interpret("Tim"));
        System.out.println("Misery is a female ? " + femaleExpression.interpret("Misery"));
    }


    public static Expression getMaleExpression(){
        Expression tim = new TerminalExpression("Tim");
        Expression john = new TerminalExpression("John");
        return  new OrExpression(tim, john);
    }

    public static Expression getMarriedWomenExpression(){
        Expression misery = new TerminalExpression("Misery");
        Expression micheala = new TerminalExpression("Michaela");
        return  new AndExpression(misery, micheala);
    }
}


/**

 Interpreter Design Pattern

 What ?
 - Behavioural
 - Provides a way to evaluate sentences in a language
 - Basic idea is that we have a class for each symbol (Terminal or non terminal).
 - Used in conjunction with the composite design pattern


 Why ?

 When ?
 - In SQL
 - In communication protocols

 Notes
 - Involves using an expression interface which evaluates the current context



 */