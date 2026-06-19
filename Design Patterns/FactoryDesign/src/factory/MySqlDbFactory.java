package factory;

import query.MySqlQuery;
import query.Query;
import transaction.SqlTransaction;
import transaction.Transaction;

public class MySqlDbFactory implements DatabaseFactory{
    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new SqlTransaction();
    }
}
