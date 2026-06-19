package synchronization;

import java.util.concurrent.Callable;

/**
 * Second version of Adder that implements Callable and uses a synchronized block
 * on the shared Value instance to safely perform increments.
 */
public class AdderV2 implements Callable<Void> {
    private Value value;

    /**
     * Constructs the AdderV2 instance.
     *
     * @param value the shared Value object to modify
     */
    public AdderV2(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 100; i++) {
            synchronized (value) {
                this.value.setX(this.value.getX() + i);
                System.out.println("Adder is adding " + i);
            }
        }
        return null;
    }
}
