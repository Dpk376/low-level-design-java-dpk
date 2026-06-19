package oops2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testDeepCopy() {
        Exam exam = new Exam(1, "Mathematics");
        Student s1 = new Student("Alice", 2024, exam);
        
        Student s2 = new Student(s1);
        
        assertNotNull(s2.getExam());
        assertNotSame(s1.getExam(), s2.getExam(), "Exams should be different objects (deep copy)");
        assertEquals(s1.getExam().getExamName(), s2.getExam().getExamName());
        
        s2.getExam().setExamName("Physics");
        assertEquals("Mathematics", s1.getExam().getExamName(), "Modifying s2 should not affect s1");
        assertEquals("Physics", s2.getExam().getExamName());
    }

    @Test
    public void testNullExamCopy() {
        Student s1 = new Student("Bob", 2023, null);
        Student s2 = new Student(s1);
        
        assertNull(s2.getExam(), "Copying a student with null exam should result in null exam");
    }
}
