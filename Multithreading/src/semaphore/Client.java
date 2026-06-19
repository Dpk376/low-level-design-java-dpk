package semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Client demonstrating the Producer-Consumer problem using Semaphores.
 */
public class Client {

    /**
     * Main method to execute the producer-consumer scenario.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Store store = new Store(5);

        ExecutorService ex = Executors.newCachedThreadPool();

        Semaphore producerSema = new Semaphore(5);
        Semaphore consumerSema = new Semaphore(0);

        for (int i = 1; i <= 8; i++) {
            Producer p = new Producer(store, producerSema, consumerSema);
            ex.execute(p);
        }

        for (int i = 1; i <= 20; i++) {
            Consumer c = new Consumer(store, producerSema, consumerSema);
            ex.execute(c);
        }

        // Note: since producers/consumers run infinitely, they would need shutdownNow() to be interrupted.
        ex.shutdown();
    }
}
