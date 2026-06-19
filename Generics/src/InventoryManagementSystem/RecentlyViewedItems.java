package InventoryManagementSystem;

import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems {

    private LinkedList<Item> items;
    private static final int MAX_SIZE = 10;

    public RecentlyViewedItems() {
        this.items = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item) {
        // remove the item if it is already present so that it can be moved at the front
        items.remove(item);

        items.addFirst(item);
        if(items.size() > MAX_SIZE) {
            items.removeLast();
        }
    }

    public List<Item> getRecentlyViewedItems() {
        return new java.util.ArrayList<>(items);
    }
}
