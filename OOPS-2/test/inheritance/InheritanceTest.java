package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InheritanceTest {

    @Test
    public void testStudentInheritance() {
        Student student = new Student("Alice", 20, 85.5);
        student.hello(); 
        student.login(); // Inherited method
        assertEquals(85.5, student.getPsp());
    }

    @Test
    public void testInstructorInheritance() {
        Instructor instructor = new Instructor("Bob", 35);
        instructor.setSalary(50000);
        instructor.login(); // Inherited method
        assertEquals(50000, instructor.getSalary());
    }
}
