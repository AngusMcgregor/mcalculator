package zm.hashcode.calculator.Impl;

import zm.hashcode.calculator.*;

/**
 * Created by hashcode on 2015/02/19.
 */
public class ModularCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        Add add = new AddImpl();
        return add(a, b);
    }

    @Override
    public int multiply(int a, int b) {
        Multiply mult = new MultiplyImpl();
        int ans = mult.multiply(a,b);
        return ans;
    }

    @Override
    public int substract(int a, int b) {
        Subtract sub = new SubtractImpl();
        return sub.subtract(a,b);
    }

    @Override
    public int divide(int a, int b) {
        Divide div = new DivideImpl();
        return div.divide(a,b);
    }
}
