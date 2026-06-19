package flyweight;

import java.util.concurrent.BlockingDeque;

public class Bullet {

    // extrinsinc
    double x;
    double y;

    // intrinsic
    BulletFlyWeight bulletFlyWeight;

    public Bullet(double x, double y, BulletFlyWeight bulletFlyWeight) {
        this.x = x;
        this.y = y;
        this.bulletFlyWeight = bulletFlyWeight;
    }
}
