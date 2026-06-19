package staticKeyword;

/**
 * Client class to demonstrate static members in the Car class.
 */
public class Client {

    /**
     * Main method.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Car c1 = new Car("ABC");
        Car c2 = new Car("XYZ");

//        System.out.println(c1.getCount());
//        System.out.println(c2.getCount());
        System.out.println(Car.getCount());
        Car.fun1();

    }
}
