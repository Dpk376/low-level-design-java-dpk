public abstract class SyrupDecorator implements  IceCream{
    protected IceCream iceCream;

    public SyrupDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
}
