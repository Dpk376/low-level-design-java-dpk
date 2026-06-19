public class Client {

    public static void main(String[] args) {

        Student aug25Student = new Student("Aug 25 student",0.0,"Aug 2025 Intermediate",78.0);
        Student sep25Student = new Student("Sep 25 student",0.0,"Sep 2025 Intermediate",87.0);

        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.addEntry("aug25Student", aug25Student);
        studentRegistry.addEntry("sep25Student",sep25Student);

        Student kishore = studentRegistry.getStudent("aug25Student");
        kishore.setName("Kishore");
        kishore.setPsp(98.0);

        Student samanvitha = studentRegistry.getStudent("aug25Student");
        samanvitha.setPsp(96.0);
        samanvitha.setName("Samanvitha");

        Student rattandeep = studentRegistry.getStudent("sep25Student");
        rattandeep.setName("Rattandeep");
        rattandeep.setPsp(95.0);

        System.out.println("DEBUG");
    }
}
