package DesignPatterns.Behavioural.Strategy;

/**
 * Created by timmanas on 2017-04-18.
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
