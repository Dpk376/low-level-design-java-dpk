package BirdV2;

/**
 * Sparrow extends the generic Bird and implements Flyable.
 * It uses Dependency Inversion Principle (DIP) by accepting a Flyer interface,
 * which determines its flying behavior at runtime.
 */
public class Sparrow extends Bird implements Flyable {

    private final Flyer flyer;

    public Sparrow() {
        this(new LowFlyer());
    }

    public Sparrow(Flyer flyer) {
        this.flyer = flyer;
    }

    @Override
    public void fly() {
        flyer.flyingStyle();
    }
}
