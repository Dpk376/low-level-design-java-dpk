package BirdV2;

/**
 * Pidgeot extends the generic Bird and implements Flyable.
 * It uses Dependency Inversion Principle (DIP) by accepting a Flyer interface,
 * which determines its flying behavior at runtime.
 */
public class Pidgeot extends Bird implements Flyable {

    private final Flyer flyer;

    public Pidgeot() {
        this(new HighFlyer());
    }

    public Pidgeot(Flyer flyer) {
        this.flyer = flyer;
    }

    @Override
    public void fly() {
        flyer.flyingStyle();
    }
}
