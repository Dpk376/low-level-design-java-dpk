package staticKeyword;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the Car class demonstrating static keywords.
 */
class CarTest {

    @Test
    void testCarCountAndModel() {
        int initialCount = Car.getCount();
        
        Car car1 = new Car("Model X");
        assertEquals("Model X", car1.getModel(), "Model should be Model X");
        assertEquals(initialCount + 1, Car.getCount(), "Count should increment by 1");

        Car car2 = new Car("Model Y");
        assertEquals("Model Y", car2.getModel(), "Model should be Model Y");
        assertEquals(initialCount + 2, Car.getCount(), "Count should increment by 2");
    }
}
