import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
//        Dbc dbc1 = Dbc.getInstance();
//        Dbc dbc2 = Dbc.getInstance();

//        System.out.println("Dbc1: "+dbc1);
//        System.out.println("Dbc2: "+dbc2);

        Runnable task = () -> {
            Dbc db = Dbc.getInstance();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "Dbc:" +db);
        };

        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=0;i<1000;i++) {
            executorService.submit(task);
        }

        executorService.shutdown();


    }
}
