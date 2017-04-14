package DesignPatterns.Behavioural.Interpreter;

/**
 * Created by timmanas on 2017-04-14.
 */
public class AndExpression implements Expression {

    public Expression expression1;
    public Expression expression2;

    public AndExpression(Expression e1, Expression e2){
        this.expression1 = e1;
        this.expression2 = e2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
