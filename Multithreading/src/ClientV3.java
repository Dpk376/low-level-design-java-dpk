import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Version demonstrating ExecutorService with Callables.
 */
public class ClientV3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        NumberMultiplier numberMultiplier = new NumberMultiplier(6);
        ExecutorService ex = Executors.newFixedThreadPool(5);
        
        Future<Integer> future = ex.submit(numberMultiplier);
        System.out.println("A");
        System.out.println("B");

        int val = future.get();
        System.out.println("Result: " + val);

        System.out.println("B");
        ex.shutdown();
    }
}
