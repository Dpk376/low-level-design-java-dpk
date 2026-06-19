public class Client {

    public static void main(String[] args) {
        IceCream iceCream = new WaffleCone();

        iceCream = new Chocolate(new MapleSyrup(new Vanilla(new Chocolate(iceCream))));
        System.out.println(iceCream.getCost());
        iceCream.getDescription();

    }
}
