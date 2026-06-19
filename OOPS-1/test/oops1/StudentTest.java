package oops1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testDefaultConstructor() {
        Student student = new Student();
        assertNull(student.getName());
        assertNull(student.getEmail());
        assertNull(student.getUniversityName());
        assertEquals(0, student.getAge());
    }

    @Test
    public void testParameterizedConstructor() {
        Student student = new Student("Alice", "alice@example.com", "MIT", 20);
        assertEquals("Alice", student.getName());
        assertEquals("alice@example.com", student.getEmail());
        assertEquals("MIT", student.getUniversityName());
        assertEquals(20, student.getAge());
    }

    @Test
    public void testNameConstructor() {
        Student student = new Student("Bob");
        assertEquals("Bob", student.getName());
    }

    @Test
    public void testSettersAndGetters() {
        Student student = new Student();
        student.setName("Charlie");
        student.setAge(22);
        
        assertEquals("Charlie", student.getName());
        assertEquals(22, student.getAge());
    }
}
