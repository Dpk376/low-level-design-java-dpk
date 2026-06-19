package factory;

import query.Query;
import transaction.Transaction;

public interface DatabaseFactory {

    Query createQuery();

    Transaction createTransaction();
}
