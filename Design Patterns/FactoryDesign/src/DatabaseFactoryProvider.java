import db.Database;
import db.MongoDb;
import db.MySqlDb;

public class DatabaseFactoryProvider {

    public static Database getDatabase(String dbName) {
        if(dbName.equalsIgnoreCase("mysql")) {
            return new MySqlDb();
        }
        else if(dbName.equalsIgnoreCase("mongoDb")) {
            return new MongoDb();
        }
        return null;
    }
}
