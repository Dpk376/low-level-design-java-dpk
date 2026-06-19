import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {
    @Test
    public void testSingletonInstance() {
        Dbc instance1 = Dbc.getInstance();
        Dbc instance2 = Dbc.getInstance();
        assertSame(instance1, instance2, "Instances should be the same");
    }
}
