/**
 * Represents a mathematical operation that takes two integer arguments and produces an integer result.
 * This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
 */
@FunctionalInterface
public interface MathematicalOperation {
    int calculate(int a, int b);
}