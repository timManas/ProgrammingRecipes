package DesignPatterns.Behavioural.Interpreter;

/**
 * Created by timmanas on 2017-04-14.
 */
public class TerminalExpression implements Expression {

    public String data;

    public TerminalExpression(String data){
        this.data = data;
    }


    @Override
    public boolean interpret(String context) {

        if(context.contains(data))
            return true;

        return false;
    }
}
