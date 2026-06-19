package BirdV2;

public class Crow extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Crow is flying for food");
    }
}
