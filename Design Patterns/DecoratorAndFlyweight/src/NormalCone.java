public class NormalCone implements IceCream{
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public void getDescription() {
        System.out.println("Normal Cone");
    }
}
