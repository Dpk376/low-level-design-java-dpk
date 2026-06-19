package synchronization;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

/**
 * Task that safely decrements a shared value concurrently.
 * Uses synchronized methods defined in the Value class.
 */
public class Subtracter implements Callable<Void> {

    private final Value value;
    private final Lock lock;

    /**
     * Constructs the Subtracter task.
     *
     * @param value the shared Value object
     * @param lock an optional Lock object
     */
    public Subtracter(Value value, Lock lock) {
        this.lock = lock;
        this.value = value;
    }

    /**
     * Executes the decrement operations.
     *
     * @return null upon completion
     * @throws Exception if an error occurs during execution
     */
    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 100; i++) {
            value.decrement(i);
        }
        return null;
    }
}
