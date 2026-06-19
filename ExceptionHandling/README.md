# Exception Handling in Java

Welcome to the **ExceptionHandling** module! This section focuses on a critical part of building robust applications: dealing with unexpected errors gracefully.

## Understanding Exceptions

When a program runs, sometimes things go wrong. A file might be missing, a database could be offline, or a user might try to divide a number by zero. Instead of crashing the whole application, Java uses **Exceptions** to report these issues so we can catch them and recover.

### Checked vs. Unchecked Exceptions

Java divides exceptions into two main categories:

1. **Checked Exceptions:**
   - **What they are:** These are exceptions that you are *forced* to handle at compile-time. The compiler checks that you've accounted for them.
   - **Examples:** `SQLException` (database error), `IOException` (file reading error), `ClassNotFoundException`.
   - **How to handle:** You must either wrap the risky code in a `try-catch` block or declare that your method `throws` the exception, passing the responsibility to whoever called your method.

2. **Unchecked Exceptions (Runtime Exceptions):**
   - **What they are:** These occur at runtime, usually due to logical programming errors. The compiler does *not* force you to handle them.
   - **Examples:** `NullPointerException`, `ArithmeticException` (e.g., divide by zero), `IllegalArgumentException`.
   - **Best Practice:** Instead of catching these, you should write better code to prevent them (e.g., checking if an object is null before using it, or checking if a denominator is zero before dividing).

### Custom Exceptions

Sometimes built-in exceptions don't fully describe the business error. In those cases, you can create your own! 
- In this project, we created an `UnderAgeException`.
- Because it extends `RuntimeException`, it is an **unchecked exception**.

## How to Run the Tests
This project includes automated tests using JUnit 5. You can compile and run them from the root directory using the standalone JUnit Console Launcher:

```bash
# Compile the main and test code
javac -d out -sourcepath src src/**/*.java
javac -d out -cp out:junit-platform-console-standalone.jar -sourcepath test test/**/*.java

# Run the tests
java -jar junit-platform-console-standalone.jar -cp out --scan-class-path
```
