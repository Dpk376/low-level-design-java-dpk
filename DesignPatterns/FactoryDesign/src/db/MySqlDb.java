package db;

import factory.DatabaseFactory;
import factory.MySqlDbFactory;
import query.MySqlQuery;
import transaction.SqlTransaction;
import transaction.Transaction;

public class MySqlDb extends Database{

    @Override
    public DatabaseFactory createFactory() {
        return new MySqlDbFactory();
    }
}
