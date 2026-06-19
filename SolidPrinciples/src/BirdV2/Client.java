package BirdV2;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void makeAllBirdsFly(List<Flyable> birds) {
        for (Flyable bird : birds) {
            bird.fly();
        }
    }

    public static void main(String[] args) {
        List<Flyable> birds = new ArrayList<>();
//        birds.add(new Sparrow());
//        birds.add(new Dove());
        birds.add(new Crow());
       // birds.add(new Pidgeot());

        Dove dove = new Dove(new LowFlyer());

        Dove d2 = new Dove(new HighFlyer());

        dove.fly();
        d2.fly();
    }
}
