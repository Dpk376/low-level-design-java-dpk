package semaphore;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Shared store used by Producers and Consumers.
 */
public class Store {

    private int maxSize;
    private final ConcurrentLinkedDeque<Object> items;

    /**
     * Constructs a Store with a specific maximum capacity.
     *
     * @param maxSize maximum number of items the store can hold
     */
    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }

    /**
     * Returns the maximum size of the store.
     *
     * @return the maximum capacity
     */
    public int getMaxSize() {
        return maxSize;
    }

    /**
     * Sets the maximum size of the store.
     *
     * @param maxSize the maximum capacity
     */
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * Retrieves the deque of items.
     *
     * @return a concurrent linked deque containing all items
     */
    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    /**
     * Adds an item to the store and prints the new size.
     *
     * @param item the item to add
     */
    public void addItem(Object item) {
        items.add(item);
        System.out.println("Item is produced: " + items.size());
    }

    /**
     * Removes an item from the store and prints the new size.
     */
    public void removeItem() {
        items.remove();
        System.out.println("Item is consumed: " + items.size());
    }
}
