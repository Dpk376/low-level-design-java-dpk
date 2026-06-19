package streams;

import java.util.List;

public class Student {

    String name;

    List<String> subjects;


    public Student(String name, List<String> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }
}
