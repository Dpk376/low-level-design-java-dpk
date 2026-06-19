public class MapleSyrup extends SyrupDecorator{

    public MapleSyrup(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 60;
    }

    @Override
    public void getDescription() {
        iceCream.getDescription();
        System.out.println("Maple Syrup");
    }
}
