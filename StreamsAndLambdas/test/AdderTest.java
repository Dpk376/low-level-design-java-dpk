import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdderTest {

    @Test
    public void testAdder() {
        Adder adder = new Adder();
        assertEquals(7, adder.calculate(4, 3));
    }

    @Test
    public void testLambdaImplementation() {
        MathematicalOperation multiplier = (a, b) -> a * b;
        assertEquals(20, multiplier.calculate(4, 5));
    }
}
