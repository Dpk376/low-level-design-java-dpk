package synchronization;

/**
 * Early version of Subtracter that implemented Runnable and manipulated the Value object without synchronization.
 */
public class SubtracterV1 implements Runnable {

    private Value value;

    /**
     * Constructs the SubtracterV1 instance.
     *
     * @param value the shared Value object to modify
     */
    public SubtracterV1(Value value) {
        this.value = value;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            this.value.setX(this.value.getX() - i);
        }
    }
}
