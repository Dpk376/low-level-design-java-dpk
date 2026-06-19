package oops2;

public class Student {

    private String name;
    private int gradYear;
    private Exam exam;

    public Student() {
    }

    public Student(String name, int gradYear, Exam exam) {
        this.name = name;
        this.gradYear = gradYear;
        this.exam = exam;
    }

    public Student(Student other) {
        this.name = other.name;
        this.gradYear = other.gradYear;
        // Deep copy of Exam
        if (other.exam != null) {
            this.exam = new Exam(other.exam);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
