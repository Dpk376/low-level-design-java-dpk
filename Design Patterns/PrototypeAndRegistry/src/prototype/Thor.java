package prototype;

public class Thor extends Avenger{

    String hammer;

    public Thor(String name,
                int power,
                String planet,
                String teamName,
                String hammer) {
        super(name, power, planet, teamName);
        this.hammer = hammer;
    }

    public Thor(Thor thor) {
        super(thor);
        this.hammer = thor.hammer;
    }

    @Override
    public Thor clone() {
        return new Thor(this);
    }
}
