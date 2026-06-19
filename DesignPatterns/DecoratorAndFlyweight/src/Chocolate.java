public class Chocolate extends ScoopDecorator{

    public Chocolate(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 100;
    }

    @Override
    public void getDescription() {
        iceCream.getDescription();
        System.out.println("Chocolate");
    }
}
