package flyweight;

public class BulletFlyWeight {

    // intrinsic attributes if bullets
    int size;
    String color;
    int power;

    public BulletFlyWeight(int size, String color, int power) {
        this.size = size;
        this.color = color;
        this.power = power;
    }
}
