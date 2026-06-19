public class Student implements Prototype<Student>{

    private String name;
    private double psp;
    private String batchName;
    private double avgBatchPsp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public Student(String name, double psp, String batchName, double avgBatchPsp) {
        this.name = name;
        this.psp = psp;
        this.batchName = batchName;
        this.avgBatchPsp = avgBatchPsp;
    }

    public Student(Student student) {
        this.name = student.name;
        this.psp = student.psp;
        this.batchName = student.batchName;
        this.avgBatchPsp = student.avgBatchPsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
