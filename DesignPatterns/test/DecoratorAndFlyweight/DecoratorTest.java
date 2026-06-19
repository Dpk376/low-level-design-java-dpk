import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {
    @Test
    public void testIceCreamCost() {
        IceCream iceCream = new Vanilla(new NormalCone());
        iceCream = new ChocolateSyrup(iceCream);
        iceCream = new MapleSyrup(iceCream);

        // NormalCone(20) + Vanilla(80) + ChocolateSyrup(50) + MapleSyrup(60) = 210
        assertEquals(210, iceCream.getCost());
    }
}
