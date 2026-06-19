package polymorphism;

public class Calculator {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
}
