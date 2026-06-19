package prototype;

public class IronMan extends Avenger{

    String jarvis;

    public IronMan(String name, int power, String planet, String teamName, String jarvis) {
        super(name, power, planet, teamName);
        this.jarvis = jarvis;
    }

    public IronMan(IronMan ironMan) {
        super(ironMan);
        this.jarvis = ironMan.jarvis;
    }

    @Override
    public IronMan clone() {
        return new IronMan(this);
    }
}
