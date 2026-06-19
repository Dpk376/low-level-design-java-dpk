/**
 * Simple task that prints a number along with the current thread name.
 */
public class NumberPrinter implements Runnable {

    private final int x;

    /**
     * Constructs the NumberPrinter.
     *
     * @param x the number to print
     */
    public NumberPrinter(int x) {
        this.x = x;
    }

    /**
     * Executes the task by printing the number and thread name.
     */
    @Override
    public void run() {
        System.out.println(this.x + ", Thread - " + Thread.currentThread().getName());
    }
}
