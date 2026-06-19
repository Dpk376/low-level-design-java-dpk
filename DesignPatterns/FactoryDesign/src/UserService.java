import db.Database;
import db.MySqlDb;
import factory.DatabaseFactory;
import query.MySqlQuery;
import query.Query;
import transaction.Transaction;

public class UserService {

    private Database db;

    public UserService(Database db) {
        this.db = db;
    }

    public void signUp() {
        DatabaseFactory dbFactory = db.createFactory();
        Query q = dbFactory.createQuery();
        q.execute();
        db.increasePoolSize();
    }

    public void doTransaction() {
        DatabaseFactory dbFactory = db.createFactory();
        Transaction t = dbFactory.createTransaction();
        t.executeTransaction();
    }
}
