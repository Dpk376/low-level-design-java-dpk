package streams;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

public class StudentStreamTest {

    @Test
    public void testStudentStream() {
        List<Student> students = List.of(
                new Student("Virat", List.of("Physics", "Chemistry")),
                new Student("Rohit", List.of("Maths", "Chemistry")),
                new Student("Bumrah", List.of("English", "Chemistry"))
        );

        Set<String> subjects = students.stream()
                .flatMap((x) -> x.getSubjects().stream())
                .collect(Collectors.toSet());

        assertEquals(4, subjects.size());
        assertTrue(subjects.containsAll(List.of("Physics", "Chemistry", "Maths", "English")));
    }
}
