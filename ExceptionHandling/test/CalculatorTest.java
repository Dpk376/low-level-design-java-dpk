import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the Calculator class demonstrating exception handling.
 */
class CalculatorTest {

    @Test
    void testDivideSuccess() throws SQLException {
        assertEquals(2, Calculator.divide(10, 5));
    }

    @Test
    void testDivideByZeroThrowsArithmeticException() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(10, 0);
        });
        assertTrue(exception.getMessage().contains("Division by zero"));
    }

    @Test
    void testDivideByTwoThrowsSQLException() {
        SQLException exception = assertThrows(SQLException.class, () -> {
            Calculator.divide(10, 2);
        });
        assertTrue(exception.getMessage().contains("Database simulated error"));
    }

    @Test
    void testDoSomethingThrowsUnderAgeException() {
        UnderAgeException exception = assertThrows(UnderAgeException.class, () -> {
            Calculator.doSomething(2);
        });
        assertTrue(exception.getMessage().contains("under the required age"));
    }

    @Test
    void testDoSomethingThrowsClassNotFoundException() {
        ClassNotFoundException exception = assertThrows(ClassNotFoundException.class, () -> {
            Calculator.doSomething(3);
        });
        assertTrue(exception.getMessage().contains("Required class was not found"));
    }

    @Test
    void testDoSomethingThrowsSQLException() {
        SQLException exception = assertThrows(SQLException.class, () -> {
            Calculator.doSomething(4);
        });
        assertTrue(exception.getMessage().contains("Simulated database failure"));
    }
}
