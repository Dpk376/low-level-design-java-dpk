import java.util.List;

public class Dbc {

    private static volatile Dbc INSTANCE;

    String url;
    String userName;
    String password;
    List<Object> pool;
    int size;

    private Dbc() {
    }

    public static Dbc getInstance() {
        if (INSTANCE == null) {
            synchronized (Dbc.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Dbc();
                }
            }
        }
        return INSTANCE;
    }
}