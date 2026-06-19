package polymorphism;

public class Client {

    public static void globalLogin(User s) {
        s.login();

    }

    public static void main(String[] args) {
//        Student u1 = new Student();
//        User u2 = new User();
//        u1.login();
//        u1.login();

//        System.out.println(u1.age);
//        u1.login();
      //  System.out.println(u2.age);

        globalLogin(new User());
        globalLogin(new Student());
        globalLogin(new Instructor());
    }
}
