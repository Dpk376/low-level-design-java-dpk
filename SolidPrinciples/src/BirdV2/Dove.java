package BirdV2;

public class Dove extends Bird implements Flyable, Danceable{

    Flyer flyer;

    public Dove(Flyer flyer) {
        this.flyer = flyer;
    }

    @Override
    public void fly() {
       flyer.flyingStyle();
    }

    @Override
    public void dance() {
        System.out.println("Dove is dancing");
    }
}
