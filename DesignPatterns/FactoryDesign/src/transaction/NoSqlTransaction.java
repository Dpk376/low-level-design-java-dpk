package transaction;

public class NoSqlTransaction implements Transaction{
    @Override
    public void executeTransaction() {
        System.out.println("NoSQL Transaction");
    }
}
