import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Version demonstrating ExecutorService with Runnables.
 */
public class ClientV2 {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        for (int i = 1; i <= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            ex.execute(numberPrinter);
        }
        ex.shutdown();
    }
}
