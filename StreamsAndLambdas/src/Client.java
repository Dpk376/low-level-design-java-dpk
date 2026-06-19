import java.util.*;
import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {

        // Using a lambda expression to define a Runnable
        Runnable task = () -> {
            System.out.println("Hello World");
        };

        Thread t = new Thread(task);
        t.start();

        List<Integer> l = new ArrayList<>(Arrays.asList(2, -3, 1, -5));

        // Lambda expression for multiplication
        MathematicalOperation multiplier = (a, b) -> a * b;
        
        // Method reference for addition
        MathematicalOperation adder = Integer::sum;
        
        System.out.println(adder.calculate(4, 3));
        
        // Uncommented calculating using multiplier
        int ans = multiplier.calculate(4, 5);
        System.out.println("Multiplier answer: " + ans);

        // Sorting the list using a lambda comparator
        Collections.sort(l, (a, b) -> a * a - b * b);
        System.out.println("Sorted list: " + l);
    }
}
