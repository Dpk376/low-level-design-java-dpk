package polymorphism;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddThreeInts() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.add(1, 2, 3));
    }

    @Test
    public void testAddDoubles() {
        Calculator calc = new Calculator();
        assertEquals(3.5, calc.add(1.5, 2.0));
    }
}
