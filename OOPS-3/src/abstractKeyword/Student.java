package abstractKeyword;

/**
 * Class representing a student user.
 */
public class Student extends User {

    private int age;

    /**
     * Constructs a new Student.
     *
     * @param name the name of the student
     * @param age  the age of the student
     */
    public Student(String name, int age) {
        super(name);
        this.age = age;
        System.out.println("Student constructor is called");
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
