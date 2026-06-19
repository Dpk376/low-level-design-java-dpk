package InventoryManagementSystem;

public class Item implements Comparable<Item>{

    private String id;
    private String name;
    private double price;
    private int quantity;

    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Item() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // this to come first -> return -ve value
    // second or passed object to come first -> return +ve value
    // return 0

    // SORT based on price in ASC
    @Override
    public int compareTo(Item o) {
        if(this.getPrice() < o.getPrice()) {
            return -1;
        }
        else if(o.getPrice() < this.getPrice()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';

    }
}
