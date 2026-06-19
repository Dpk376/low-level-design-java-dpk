package semaphore;

import java.util.concurrent.Semaphore;

/**
 * Producer task that adds items to a shared store.
 * Uses Semaphores to coordinate with Consumers.
 */
public class Producer implements Runnable {

    private final Store store;
    private final Semaphore producerSema;
    private final Semaphore consumerSema;

    /**
     * Constructs the Producer.
     *
     * @param store the shared store
     * @param producerSema the semaphore regulating producer capacity
     * @param consumerSema the semaphore regulating consumer capacity
     */
    public Producer(Store store,
                    Semaphore producerSema,
                    Semaphore consumerSema) {
        this.producerSema = producerSema;
        this.consumerSema = consumerSema;
        this.store = store;
    }

    /**
     * Continuously produces items.
     * Blocks if the store is full until a consumer consumes an item.
     */
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                producerSema.acquire();
                store.addItem(new Object());
                consumerSema.release();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Proper error handling
                System.err.println("Producer was interrupted: " + e.getMessage());
                break;
            }
        }
    }
}
