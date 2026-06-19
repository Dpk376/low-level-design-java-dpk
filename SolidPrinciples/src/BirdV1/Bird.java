package BirdV1;

/**
 * Bird version 1 (V1) implementation.
 * 
 * WHY THIS VERSION EXISTS:
 * This version attempts to fix the SRP and OCP violations of V0 by making fly() an abstract method.
 * Subclasses can now implement their own fly() logic, removing the need for modifying the base class.
 * 
 * However, this introduces a Liskov Substitution Principle (LSP) violation.
 * If a non-flying bird (e.g., Penguin) extends Bird, it is forced to implement fly(),
 * which would either do nothing or throw an exception, breaking LSP expectations.
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

    public abstract void fly();

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