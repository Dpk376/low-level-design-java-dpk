package inheritance;

public class Student extends User {

    private double psp;

    public Student() {
        super();
    }

    public Student(String name) {
        super();
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);
        this.age = age;
    }

    public Student(String name, int age, double psp) {
        this(name, age);
        this.psp = psp;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void hello() {
        System.out.println("HELLO from student");
    }
}
