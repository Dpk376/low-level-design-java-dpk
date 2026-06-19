package polymorphism;

/**
 * Class representing a student user in the system.
 */
public class Student extends User {

    private int age = 20;

    /**
     * Executes a random action.
     */
    public void random() {
        System.out.println("Random");
    }

    /**
     * Logs the student into the system.
     */
    @Override
    public void login() {
        System.out.println("Student is logged in");
    }

    /**
     * Gets the age of the student.
     *
     * @return the age of the student
     */
    public int getAge() {
        return age;
    }
}
