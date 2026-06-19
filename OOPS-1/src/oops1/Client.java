package oops1;

/**
 * Client class to demonstrate the usage of the Student class.
 */
public class Client {

    public static void main(String[] args) {
        // Creating student objects using the parameterized constructor
        Student s = new Student("ABC", "viko18@gmail.com", "XYZ", 36);
        Student t = new Student("DEF", "student2@gmail.com", "PQR", 25);

        // Demonstrating method calls on objects
        s.attendClass();
        t.attendClass();

        // Demonstrating usage of getters and setters
        s.setAge(37);
        System.out.println(s.getName() + " is now " + s.getAge() + " years old.");
    }
}
