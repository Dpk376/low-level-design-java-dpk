package streams;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

    /**
     * Main method demonstrating various Stream API operations.
     * Includes filtering, mapping, reducing, and flat-mapping.
     * @param args command line arguments
     */
    public static void main(String[] args) {

        List<Integer> l1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Demonstrates stream processing: filter even numbers, square them, and sum the results
        int ans = l1.stream()
                // filter: keeps elements that satisfy the given predicate
                .filter((x) -> {
                    System.out.println("Checking div by 2: " + x);
                    return x % 2 == 0;
                })
                // map: transforms elements using the given function
                .map((x) -> x * x)
                // reduce: combines elements into a single result (sum in this case)
                .reduce(0, Integer::sum);

        System.out.println("Sum of squares of even numbers: " + ans);

        // Demonstrates finding the first element matching a predicate
        Optional<Integer> y = l1.stream()
                // filter: keeps only even numbers
                .filter((x) -> {
                    System.out.println("Check div by 2: " + x);
                    return x % 2 == 0;
                })
                // findFirst: returns the first element in the stream
                .findFirst();

        // ifPresent is preferred, but retaining original structure with isPresent
        if(y.isPresent()) {
            System.out.println("First even number: " + y.get());
        }

        List<Integer> l2 = List.of(3, 4, 5);

        // Demonstrates reducing to a product
        int mul = l2.stream()
                // reduce: multiplies all elements together, starting with identity 1
                .reduce(1, (curr, x) -> curr * x);

        System.out.println("Product of l2: " + mul);

        List<Student> students = List.of(
                new Student("Virat", List.of("Physics", "Chemistry")),
                new Student("Rohit", List.of("Maths", "Chemistry")),
                new Student("Bumrah", List.of("English", "Chemistry"))
        );

        // Demonstrates flatMap to flatten collections of items into a single stream
        Set<String> subjects = students.stream()
                // flatMap: takes each Student's list of subjects and flattens them into a single Stream of Strings
                .flatMap((x) -> x.getSubjects().stream())
                // collect: accumulates elements into a Set, removing duplicates
                .collect(Collectors.toSet());

        System.out.println("Unique subjects: " + subjects);
    }
}
