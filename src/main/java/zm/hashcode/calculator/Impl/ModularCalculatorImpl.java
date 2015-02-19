package zm.hashcode.calculator.Impl;

import zm.hashcode.calculator.*;

/**
 * Created by hashcode on 2015/02/19.
 */
public class ModularCalculatorImpl implements Calculator {
    private Add addmodule =new AddImpl();
    private Multiply multmodule=new MultiplyImpl();
    private Subtract subtractmodule = new SubtractImpl();
    private Divide dividemodule = new DivideImpl();
    @Override
    public int add(int a, int b) {
        return addmodule.add(a, b);
    }

    @Override
    public int multiply(int a, int b) {
        return multmodule.multiply(a,b);
    }

    @Override
    public int substract(int a, int b) {
        return subtractmodule.subtract(a,b);
    }

    @Override
    public int divide(int a, int b) {
        return dividemodule.divide(a,b);
    }
}
