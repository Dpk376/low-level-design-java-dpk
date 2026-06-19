package semaphore;

/**
 * Early version of Producer using synchronized block instead of semaphores.
 * Demonstrates basic wait/notify or purely synchronized mechanics.
 */
public class ProducerV1 implements Runnable {

    private final Store store;

    /**
     * Constructs ProducerV1 instance.
     *
     * @param store the shared store object
     */
    public ProducerV1(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                if (store.getItems().size() < store.getMaxSize()) {
                    store.addItem(new Object());
                }
            }
        }
    }
}
