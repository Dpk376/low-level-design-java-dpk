public abstract class ScoopDecorator implements IceCream{
    protected IceCream iceCream;

    public ScoopDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
}
