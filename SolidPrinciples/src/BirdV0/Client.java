package BirdV0;

public class Client {

    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.setAge(10);
        b1.setName("b1");
        b1.setType("crow");

        Bird b2 = new Bird();
        b2.setAge(10);
        b2.setName("b2");
        b2.setType("dove");

        b1.eat();
        b2.eat();

        b1.fly();
        b2.fly();
    }
}
