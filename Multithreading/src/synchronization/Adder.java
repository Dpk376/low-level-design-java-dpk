package synchronization;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

/**
 * Task that safely increments a shared value concurrently.
 * Uses synchronized methods defined in the Value class.
 */
public class Adder implements Callable<Void> {
    private final Value value;
    private final Lock lock;

    /**
     * Constructs the Adder task.
     *
     * @param value the shared Value object
     * @param lock an optional Lock object
     */
    public Adder(Value value, Lock lock) {
        this.lock = lock;
        this.value = value;
    }

    /**
     * Executes the increment operations.
     *
     * @return null upon completion
     * @throws Exception if an error occurs during execution
     */
    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 100; i++) {
            value.increment(i);
        }
        return null;
    }
}
