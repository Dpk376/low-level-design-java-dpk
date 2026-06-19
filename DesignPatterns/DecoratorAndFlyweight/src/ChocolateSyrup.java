public class ChocolateSyrup extends SyrupDecorator{

    public ChocolateSyrup(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 50;
    }

    @Override
    public void getDescription() {
        iceCream.getDescription();
        System.out.println("Chocolate Syrup");
    }
}
