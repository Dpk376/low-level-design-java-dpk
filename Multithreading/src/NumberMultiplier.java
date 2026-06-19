import java.util.concurrent.Callable;

/**
 * Task that multiplies a given number by 5.
 * Demonstrates basic Callable usage.
 */
public class NumberMultiplier implements Callable<Integer> {

    private final int x;

    /**
     * Constructs the NumberMultiplier.
     *
     * @param x the number to multiply
     */
    public NumberMultiplier(int x) {
        this.x = x;
    }

    /**
     * Executes the multiplication.
     *
     * @return the result of x * 5
     * @throws Exception if an error occurs
     */
    @Override
    public Integer call() throws Exception {
        return this.x * 5;
    }
}
