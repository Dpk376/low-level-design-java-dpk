package inheritance;

public class Instructor extends User {

    private int salary;

    public Instructor() {
        super();
    }

    public Instructor(String name, int age) {
        super(name, age);
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
