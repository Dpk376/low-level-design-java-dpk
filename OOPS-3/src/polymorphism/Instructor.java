package polymorphism;

/**
 * Class representing an instructor user in the system.
 */
public class Instructor extends User {

    /**
     * Logs the instructor into the system.
     */
    @Override
    public void login() {
        System.out.println("Instructor is logged in");
    }
}
