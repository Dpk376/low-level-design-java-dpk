# Streams and Lambdas

This module demonstrates the power of Java 8+ features, specifically Lambda Expressions and the Stream API.

## Key Concepts Covered
- **Functional Interfaces**: The `@FunctionalInterface` annotation is used in `MathematicalOperation` to signify an interface with a single abstract method (SAM), which can be implemented using lambda expressions.
- **Lambda Expressions**: Concise ways to implement functional interfaces without writing full classes, shown in `Client.java` using the `(a, b) -> a * b` syntax.
- **Method References**: Using `Integer::sum` as a shorthand for lambda expressions.
- **Stream API**: The `streams/Client.java` file demonstrates essential operations:
  - `filter()`: Selecting elements based on a condition.
  - `map()`: Transforming elements.
  - `reduce()`: Aggregating elements into a single result.
  - `flatMap()`: Flattening nested collections into a single stream.
- **Parallel Streams**: `ComparisonClient.java` contrasts the performance of sequential and parallel streams.

## Testing
JUnit tests in the `test/` directory validate lambda behavior and stream operations. Use the provided `junit-platform-console-standalone.jar` to run them.
