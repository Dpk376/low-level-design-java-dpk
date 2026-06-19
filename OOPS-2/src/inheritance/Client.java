package inheritance;

/**
 * Demonstrates inheritance concepts and polymorphic method dispatch.
 */
public class Client {

    public static void main(String[] args) {
        Student s = new Student("XYZ", 24, 98);
        s.hello();
        
        // Upcasting: A Student IS-A User
        User u = new Student("ABC", 23, 87);
        u.login();
        // u.hello(); // Not allowed because reference type is User

        // Polymorphism via method arguments
        doSomethingForUser(new Student());
        doSomethingForUser(new Instructor());
    }

    public static void doSomethingForUser(User u) {
        u.login();
    }
}
