import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuilderTest {
    @Test
    public void testStudentBuilder() {
        Student student = Student.getBuilder()
                .setName("Alice")
                .setGradYear(2023)
                .build();
        assertNotNull(student);
    }

    @Test
    public void testStudentValidationFails() {
        assertThrows(RuntimeException.class, () -> {
            Student.getBuilder()
                    .setName("Bob")
                    .setGradYear(2020)
                    .build();
        });
    }
}
