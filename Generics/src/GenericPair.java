/**
 * A generic pair class that holds two values of possibly different types.
 *
 * @param <T> the type of the first value
 * @param <V> the type of the second value
 */
public class GenericPair<T,V> {

    private T value1;
    private V value2;
    private int age;

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public V getValue2() {
        return value2;
    }

    public void setValue2(V value2) {
        this.value2 = value2;
    }

    public <E> void printSomething(E val) {
        System.out.println(val);
    }

    public static <X> void doSomething(X val) {
        System.out.println(val);
    }
}