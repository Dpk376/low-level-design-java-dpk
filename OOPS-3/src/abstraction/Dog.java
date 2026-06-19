package abstraction;

public class Dog  extends Animal implements CanRun{
    @Override
    public void run() {
        System.out.println("Dog can run");
    }
}
