package db;

import factory.DatabaseFactory;
import factory.MongoDbFactory;
import query.NoSqlQuery;
import query.Query;
import transaction.NoSqlTransaction;
import transaction.Transaction;

public class MongoDb extends Database{
    @Override
    public DatabaseFactory createFactory() {
        return new MongoDbFactory();
    }
}
