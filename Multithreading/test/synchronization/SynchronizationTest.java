package synchronization;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SynchronizationTest {

    @Test
    void testAdderAndSubtracter() throws ExecutionException, InterruptedException {
        Lock lock = new ReentrantLock();
        Value value = new Value(0);
        Adder adder = new Adder(value, lock);
        Subtracter subtracter = new Subtracter(value, lock);

        ExecutorService ex = Executors.newFixedThreadPool(2);
        Future<Void> futureAdder = ex.submit(adder);
        Future<Void> futureSub = ex.submit(subtracter);

        futureAdder.get();
        futureSub.get();

        // Increment 1 to 100 = 5050. Decrement 1 to 100 = 5050. Result should be 0.
        assertEquals(0, value.getX(), "Value should be exactly 0 after concurrent add and subtract");

        ex.shutdown();
    }
}
