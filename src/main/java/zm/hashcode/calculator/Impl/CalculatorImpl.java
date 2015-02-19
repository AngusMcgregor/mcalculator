package zm.hashcode.calculator.Impl;

import zm.hashcode.calculator.Calculator;

/**
 * Created by hashcode on 2015/02/19.
 */
public class CalculatorImpl implements Calculator{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public int substract(int a, int b) {
        return a-b;
    }

    @Override
    public int divide(int a, int b) {
        return a/b;
    }
}
