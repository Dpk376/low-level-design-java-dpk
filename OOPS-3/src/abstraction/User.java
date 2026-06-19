package abstraction;

public abstract class User {

    String name;

    public void login() {
        System.out.println("User is logged in");
    }

    public abstract void sayHello();
}
