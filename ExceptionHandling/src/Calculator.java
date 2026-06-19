import java.sql.SQLException;

/**
 * A utility class for calculations and exception demonstrations.
 *
 * <p><b>Checked vs Unchecked Exceptions:</b></p>
 * <ul>
 *   <li><b>Checked Exceptions:</b> These are checked at compile-time. Examples include {@code SQLException} and {@code ClassNotFoundException}.
 *   You must handle these explicitly using a try-catch block or declare them in the method signature with the {@code throws} keyword.</li>
 *   <li><b>Unchecked Exceptions (Runtime Exceptions):</b> These are not checked at compile-time and usually represent programming errors 
 *   (like {@code ArithmeticException} or {@code NullPointerException}). It is generally good practice to prevent them via validation rather than catching them.</li>
 * </ul>
 */
public class Calculator {

    /**
     * Divides two numbers.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the result of the division
     * @throws SQLException if a specific error condition occurs (b == 2)
     * @throws ArithmeticException if the divisor is zero
     */
    public static int divide(int a, int b) throws SQLException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed. Please provide a non-zero divisor.");
        }
        
        if (b == 2) {
            throw new SQLException("Database simulated error: divisor cannot be 2.");
        }
        return a / b;
    }

    /**
     * Demonstrates throwing various types of exceptions based on the input.
     *
     * @param a the input value
     * @throws ClassNotFoundException if input is 3
     * @throws SQLException if input is 4
     */
    public static void doSomething(int a) throws ClassNotFoundException, SQLException {
        if (a == 2) {
            throw new UnderAgeException("User is under the required age limit of 18.");
        } else if (a == 3) {
            throw new ClassNotFoundException("Required class was not found in the classpath for input 3.");
        } else if (a == 4) {
            throw new SQLException("Simulated database failure for input 4.");
        }
    }
}
