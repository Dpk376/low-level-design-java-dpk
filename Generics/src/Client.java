public class Client {

    public static void main(String[] args) {
        Pair co_ord = new Pair();
        co_ord.x = 3;
        co_ord.y = 4;

        Pair sPair = new Pair();
        sPair.x = 100;
        sPair.y = 30.4;

        String name = (String)sPair.x;

        GenericPair<Integer,Integer> gp = new GenericPair<>();
        //gp.value1 =

        GenericPair<String, Integer> sGp = new GenericPair<>();
//        sGp.value1 = "ABC";
//        sGp.value2 = 34;

        GenericPair<String,Integer> p = new GenericPair<>();
        p.printSomething("asfdasf");
        // static methods have to be generic
        GenericPair.doSomething("asfa");

    }
}
