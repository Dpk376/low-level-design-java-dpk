package bounding;

import java.util.Collection;
import java.util.Map;

public class Calculator<T> {

    T val1;
    T val2;

    public <T extends Number> Number add(T val1, T val2) {
        return val1.intValue()+val2.intValue();
    }

    public void doSomething() {
        System.out.println(val1);
    }

    public void printX(User us) {
    }
    //

}
