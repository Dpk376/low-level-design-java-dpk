import org.junit.jupiter.api.Test;
import prototype.Avenger;
import prototype.IronMan;
import prototype.Thor;

import static org.junit.jupiter.api.Assertions.*;

public class PrototypeTest {
    @Test
    public void testClone() {
        IronMan ironMan = new IronMan("Tony", 100, "Earth", "Avengers", "Jarvis");
        IronMan clone = ironMan.clone();

        assertNotSame(ironMan, clone);
        assertEquals(ironMan.name, clone.name);
    }
}
