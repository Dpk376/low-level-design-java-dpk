package db;

import factory.DatabaseFactory;
import query.Query;
import transaction.Transaction;

public abstract class Database {

    String url;
    String password;
    int poolSize;

    public void increasePoolSize() {
        this.poolSize += 5;
    }

    public void createConnection() {
        System.out.println("Database connecting");
    }

    public abstract DatabaseFactory createFactory();

}
