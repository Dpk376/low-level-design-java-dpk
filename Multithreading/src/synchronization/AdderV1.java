package synchronization;

/**
 * Early version of Adder that implemented Runnable and manipulated the Value object without synchronization.
 * Demonstrates the issues of unsynchronized access and basic Thread usage.
 */
public class AdderV1 implements Runnable {
    private Value value;

    /**
     * Constructs the AdderV1 instance.
     *
     * @param value the shared Value object to modify
     */
    public AdderV1(Value value) {
        this.value = value;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i == 50) {
                try {
                    Thread.sleep(10000);
                    System.out.println("Hello");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Proper error handling
                    System.err.println("Thread was interrupted during sleep");
                }
            }
            this.value.setX(this.value.getX() + i);
        }
    }
}
