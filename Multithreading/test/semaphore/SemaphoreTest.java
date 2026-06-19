package semaphore;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SemaphoreTest {

    @Test
    void testProducerConsumer() throws InterruptedException {
        Store store = new Store(5);
        ExecutorService ex = Executors.newCachedThreadPool();

        Semaphore producerSema = new Semaphore(5);
        Semaphore consumerSema = new Semaphore(0);

        for (int i = 1; i <= 2; i++) {
            ex.execute(new Producer(store, producerSema, consumerSema));
        }

        for (int i = 1; i <= 5; i++) {
            ex.execute(new Consumer(store, producerSema, consumerSema));
        }

        // Wait a little for threads to run
        Thread.sleep(100);
        
        ex.shutdownNow(); // Interrupt threads to stop them
        assertTrue(ex.awaitTermination(1, TimeUnit.SECONDS), "Executor should terminate");
        
        // Assert store constraints
        assertTrue(store.getItems().size() >= 0 && store.getItems().size() <= store.getMaxSize(), 
                "Store items should be within bounds");
    }
}
