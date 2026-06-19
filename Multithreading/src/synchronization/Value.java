package synchronization;

/**
 * A shared value wrapper used to demonstrate synchronization and multithreading concepts.
 */
public class Value {
    private int x;

    /**
     * Constructs a Value instance with an initial integer value.
     *
     * @param x the initial value
     */
    public Value(int x) {
        this.x = x;
    }

    /**
     * Gets the current value.
     *
     * @return the current value
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the value.
     *
     * @param x the new value
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Increments the value safely in a multithreaded environment.
     *
     * @param i the amount to increment by
     */
    public synchronized void increment(int i) {
        this.x += i;
    }

    /**
     * Decrements the value safely in a multithreaded environment.
     *
     * @param i the amount to decrement by
     */
    public synchronized void decrement(int i) {
        this.x -= i;
    }
}
