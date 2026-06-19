package oops2;

public class Exam {

    private int examId;
    private String examName;

    public Exam(int examId, String examName) {
        this.examId = examId;
        this.examName = examName;
    }

    public Exam(Exam other) {
        this.examId = other.examId;
        this.examName = other.examName;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }
}
