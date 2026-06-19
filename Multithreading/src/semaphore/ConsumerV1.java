package semaphore;

/**
 * Early version of Consumer using synchronized block instead of semaphores.
 * Demonstrates basic wait/notify or purely synchronized mechanics.
 */
public class ConsumerV1 implements Runnable {

    private final Store store;

    /**
     * Constructs ConsumerV1 instance.
     *
     * @param store the shared store object
     */
    public ConsumerV1(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                if (!store.getItems().isEmpty()) {
                    store.removeItem();
                }
            }
        }
    }
}
