package BirdV2;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirdTest {

    @Test
    public void testSparrowFly() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Flyer lowFlyer = new LowFlyer();
        Sparrow sparrow = new Sparrow(lowFlyer);
        sparrow.fly();

        assertEquals("I fly low\n", outContent.toString());
        System.setOut(System.out); // Reset System.out
    }

    @Test
    public void testPidgeotFly() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Flyer highFlyer = new HighFlyer();
        Pidgeot pidgeot = new Pidgeot(highFlyer);
        pidgeot.fly();

        assertEquals("I fly high\n", outContent.toString());
        System.setOut(System.out); // Reset System.out
    }
}
