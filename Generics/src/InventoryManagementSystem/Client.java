package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Item i1 = new Item("1","Bat",3000,5);
        Item i2 = new Item("2","Bowl",200,3);
        Item i3 = new Item("3","Stumps",500,7);
        Item i4 = new Item("3","Food",400,5);

        List<Item> items = new ArrayList<>();
        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);

        Collections.sort(items, new ItemComparatorQuantityAndPrice()); // natural ordering -> price

        for(Item item: items) {
            System.out.println(item);
        }

        List<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.size();
        l2.size();

        l2.trimToSize();
        // l1.trimToSize() -> not poissible

        Inventory<Book> bookInventory = new Inventory<>();
        bookInventory.addItem(new Book("1","Harry Potter",350,3,"J.K. Rowling"));
        bookInventory.addItem(new Book("2","The Third Door",600,2,"Alex Banyan"));
        //bookInventory.addItem(new Book("2","The Third Door",600,2,"Alex Banyan"));

        System.out.println(bookInventory.getAllItems());


    }
}
