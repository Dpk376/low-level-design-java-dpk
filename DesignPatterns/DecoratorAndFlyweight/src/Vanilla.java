public class Vanilla extends ScoopDecorator{

    public Vanilla(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 80;
    }

    @Override
    public void getDescription() {
        iceCream.getDescription();
        System.out.println("Vanilla");
    }
}
