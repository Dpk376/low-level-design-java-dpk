package BirdV2;

/**
 * Bird version 2 (V2) implementation.
 * 
 * WHY THIS VERSION EXISTS:
 * This version resolves the LSP violation seen in V1 by utilizing Interface Segregation Principle (ISP)
 * and Dependency Inversion Principle (DIP).
 * - ISP: The fly() method is moved to a separate Flyable interface. Non-flying birds (like Penguin) 
 *   do not implement Flyable.
 * - DIP: Flying behavior is abstracted into a Flyer interface and injected into birds (e.g. Sparrow, Dove).
 *   This decouples the bird implementation from its specific flying behavior.
 */
public abstract class Bird {
    private String name;
    private int age;
    private int numberOfLegs;
    private String type;

    public void eat(){
        System.out.println("Bird : " + name + " is eating!");
    }

    public void sleep(){
        System.out.println("Bird : " + name + " is sleeping!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}