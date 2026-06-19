package semaphore;

import java.util.concurrent.Semaphore;

/**
 * Consumer task that removes items from a shared store.
 * Uses Semaphores to coordinate with Producers.
 */
public class Consumer implements Runnable {
    private final Store store;
    private final Semaphore producerSema;
    private final Semaphore consumerSema;

    /**
     * Constructs the Consumer.
     *
     * @param store the shared store
     * @param producerSema the semaphore regulating producer capacity
     * @param consumerSema the semaphore regulating consumer capacity
     */
    public Consumer(Store store,
                    Semaphore producerSema,
                    Semaphore consumerSema) {
        this.producerSema = producerSema;
        this.consumerSema = consumerSema;
        this.store = store;
    }

    /**
     * Continuously consumes items.
     * Blocks if the store is empty until a producer produces an item.
     */
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                consumerSema.acquire();
                store.removeItem();
                producerSema.release();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Proper error handling
                System.err.println("Consumer was interrupted: " + e.getMessage());
                break;
            }
        }
    }
}
