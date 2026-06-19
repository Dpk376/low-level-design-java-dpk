public class AcademyStudent extends Student{
    String specialization;

    public AcademyStudent(String name, double psp, String batchName, double avgBatchPsp,
                          String specialization) {
        super(name, psp, batchName, avgBatchPsp);
        this.specialization = specialization;
    }

    public AcademyStudent(AcademyStudent student) {
        super(student);
        this.specialization = student.specialization;
    }

    @Override
    public AcademyStudent clone() {
        return new AcademyStudent(this);
    }
}
