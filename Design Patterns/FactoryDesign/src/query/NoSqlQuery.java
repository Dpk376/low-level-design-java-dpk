package query;

public class NoSqlQuery implements Query{

    public void runQuery() {
        System.out.println("User saved in Mongo");
    }

    @Override
    public void execute() {
        runQuery();
    }
}
