public class WaffleCone implements IceCream{
    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public void getDescription() {
        System.out.println("Waffle Cone");
    }
}
