package prototype;

public class Client {

//    public static void saveEarth(Prototype.Avenger avenger) {
//        Prototype.Avenger copy = null;
//        if(avenger instanceof Prototype.Avenger) {
//            copy = new Prototype.Avenger(avenger);
//        }
//        else if(avenger instanceof Prototype.IronMan) {
//            copy = new Prototype.IronMan((Prototype.IronMan) avenger);
//        }
//        else if(avenger instanceof Prototype.Thor) {
//            copy = new Prototype.Thor((Prototype.Thor) avenger);
//        }
//    }

    public static void saveEarth(Avenger avenger) {
        Avenger avenger1 = avenger.clone();
        System.out.println("DEBUG");
    }

    public static void main(String[] args) {
       // Prototype.Avenger avenger = new Prototype.Avenger("Base Prototype.Avenger",98,"Earth","avengers");

//        Prototype.Avenger copyAvenger = new Prototype.Avenger();
//        copyAvenger.name = avenger.name;
//        copyAvenger.power = avenger.power;
//        copyAvenger.planet = avenger.planet;
//        copyAvenger.teamName = avenger.teamName;

       // Prototype.IronMan avenger = new Prototype.IronMan("Tony Stark",98,"Earth","avengers", "Hey Jarvis");

        Thor avenger = new Thor("Prototype.Thor",98,"Earth","avengers", "Hey Jarvis");

        saveEarth(avenger);


      //  Prototype.Avenger thor = new Prototype.Thor("Prototype.Thor",98,"Asgard","avengers", "Mojuneir");


    }
}
