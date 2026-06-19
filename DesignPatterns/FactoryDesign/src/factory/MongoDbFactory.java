package factory;

import query.NoSqlQuery;
import query.Query;
import transaction.NoSqlTransaction;
import transaction.Transaction;

import javax.xml.crypto.Data;

public class MongoDbFactory implements DatabaseFactory {
    @Override
    public Query createQuery() {
        return new NoSqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new NoSqlTransaction();
    }
}
