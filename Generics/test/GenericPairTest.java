import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GenericPairTest {

    @Test
    public void testGenericPair() {
        GenericPair<String, Integer> pair = new GenericPair<>();
        pair.setValue1("Hello");
        pair.setValue2(42);

        assertEquals("Hello", pair.getValue1());
        assertEquals(42, pair.getValue2());
    }
}
