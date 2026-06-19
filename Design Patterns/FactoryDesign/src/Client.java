import db.Database;
import db.MongoDb;
import db.MySqlDb;

import javax.xml.crypto.Data;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dbName = sc.next();

        Database db = DatabaseFactoryProvider.getDatabase(dbName);
        UserService userService = new UserService(db);


        userService.signUp();
        userService.doTransaction();
        sc.close();
    }
}
