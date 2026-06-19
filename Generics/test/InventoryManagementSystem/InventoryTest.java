package InventoryManagementSystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryTest {

    @Test
    public void testInventory() {
        Inventory<Item> inventory = new Inventory<>();
        Electronics laptop = new Electronics("E1", "Laptop", 1000.0, 10, 12);

        inventory.addItem(laptop);
        
        assertEquals(laptop, inventory.getItem("E1"));
        assertEquals(1, inventory.getAllItems().size());

        inventory.removeItem("E1");
        assertNull(inventory.getItem("E1"));
    }
}
