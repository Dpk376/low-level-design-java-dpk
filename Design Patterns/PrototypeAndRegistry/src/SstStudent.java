public class SstStudent extends Student{

    int credits;

    public SstStudent(String name, double psp, String batchName, double avgBatchPsp, int credit) {
        super(name, psp, batchName, avgBatchPsp);
        this.credits = credit;
    }

    public SstStudent(SstStudent student) {
        super(student);
        this.credits = student.credits;
    }

    @Override
    public SstStudent clone() {
        return new SstStudent(this);
    }
}
