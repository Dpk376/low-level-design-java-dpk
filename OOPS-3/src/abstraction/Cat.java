package abstraction;

import staticKeyword.Car;

public class Cat extends Animal implements CanRun {
    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}
