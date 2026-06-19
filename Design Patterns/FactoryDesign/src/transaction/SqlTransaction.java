package transaction;

public class SqlTransaction implements Transaction{
    @Override
    public void executeTransaction() {
        System.out.println("SQL transaction");
    }
}
