package InventoryManagementSystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecentlyViewedItemsTest {

    @Test
    public void testRecentlyViewedItems() {
        RecentlyViewedItems items = new RecentlyViewedItems();
        
        for (int i = 0; i < 15; i++) {
            Electronics item = new Electronics("E" + i, "Name", 10.0, 1, 12);
            items.addRecentlyViewedItem(item);
        }

        assertEquals(10, items.getRecentlyViewedItems().size());
        assertEquals("E14", items.getRecentlyViewedItems().get(0).getId());
    }
}
