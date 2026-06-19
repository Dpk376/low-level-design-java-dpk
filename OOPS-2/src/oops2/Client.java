package oops2;

/**
 * Demonstrates the concept of deep copying vs shallow copying and object references.
 */
public class Client {

    public static void main(String[] args) {
        Exam exam = new Exam(1, "Java");
        Student s1 = new Student("ABC", 2020, exam);
        
        // Deep copy of student
        Student s2 = new Student(s1);
        
        // Changing s2's exam shouldn't affect s1's exam due to deep copy
        s2.getExam().setExamName("Python");
        
        System.out.println("S1 Exam: " + s1.getExam().getExamName()); // Output: Java
        System.out.println("S2 Exam: " + s2.getExam().getExamName()); // Output: Python

        // Object reference passing
        fun(s1);
        // Because Objects are passed by reference value, changes inside fun affect s1
        System.out.println("S1 Grad Year after fun(): " + s1.getGradYear());
    }

    /**
     * Modifies the given student's graduation year.
     * Demonstrates that objects are passed by reference value in Java.
     * @param s The student to modify
     */
    static void fun(Student s) {
         s.setGradYear(2024);
    }
}
