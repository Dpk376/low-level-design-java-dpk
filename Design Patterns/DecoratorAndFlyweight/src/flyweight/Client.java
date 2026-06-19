package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        BulletFlyWeight ak47Bullet = new BulletFlyWeight(10,"Black",100);
        BulletFlyWeight sniper = new BulletFlyWeight(8,"Gray",110);

        // 10000 ak 47
        // 10000 snipper

        List<Bullet> ak47Bullets = new ArrayList<>();
        for(int i=0;i<10000;i++) {
            ak47Bullets.add(new Bullet(Math.random(),Math.random(),ak47Bullet));
        }

        List<Bullet> snippers = new ArrayList<>();
        for(int i=0;i<10000;i++) {
            snippers.add(new Bullet(Math.random(),Math.random(),sniper));
        }

        System.out.println("DEBUG");
    }
}
