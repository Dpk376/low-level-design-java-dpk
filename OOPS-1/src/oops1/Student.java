package oops1;

/**
 * Represents a student with a name, email, university name, and age.
 * Demonstrates basic Object-Oriented Programming concepts like classes, objects, and encapsulation.
 */
public class Student {
    private String name;
    private String email;
    private String universityName;
    private int age;

    /**
     * Default constructor.
     */
    public Student() {
    }

    /**
     * Parameterized constructor to initialize all fields.
     *
     * @param name           the name of the student
     * @param email          the email address of the student
     * @param universityName the university the student attends
     * @param age            the age of the student
     */
    public Student(String name, String email, String universityName, int age) {
        this.name = name;
        this.email = email;
        this.universityName = universityName;
        this.age = age;
    }

    /**
     * Parameterized constructor to initialize just the name.
     *
     * @param name the name of the student
     */
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Simulates the student attending a class.
     */
    public void attendClass() {
        System.out.println("Student " + name + " is attending the class");
    }
}
