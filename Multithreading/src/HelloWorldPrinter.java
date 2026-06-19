/**
 * Simple task that prints "Hello world" along with the current thread name.
 */
public class HelloWorldPrinter implements Runnable {

    /**
     * Executes the task by printing the message.
     */
    @Override
    public void run() {
        print();
    }

    /**
     * Prints the hello message and thread name.
     */
    public void print() {
        System.out.println("Hello world, Thread name = " + Thread.currentThread().getName());
    }
}
