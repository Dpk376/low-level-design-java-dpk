package abstraction;

/**
 * Client class to demonstrate abstraction and interfaces.
 */
public class Client {

    /**
     * Makes any object that implements CanRun run.
     *
     * @param a the CanRun object
     */
    public static void makeRun(CanRun a) {
        a.run();
    }

    /**
     * Main method.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
//        Cat c = new Cat();
//        c.run();

//        Student s = new Student();
//        s.sayHello();
//        s.login();

        makeRun(new Cat());
        makeRun(new Dog());
        makeRun(new RoboticDog());
    }
}
