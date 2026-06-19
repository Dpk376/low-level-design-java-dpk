import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String, Student> registry;

    public StudentRegistry() {
        this.registry = new HashMap<>();
    }

    public void addEntry(String key, Student student) {
        this.registry.put(key,student);
    }

    public Student getStudent(String key) {
        return this.registry.get(key).clone();
    }
}
