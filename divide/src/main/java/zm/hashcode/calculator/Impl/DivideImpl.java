package zm.hashcode.calculator.Impl;

import zm.hashcode.calculator.Divide;

/**
 * Created by hashcode on 2015/02/19.
 */
public  class DivideImpl implements Divide{
    @Override
    public int divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a/b;
    }
}
