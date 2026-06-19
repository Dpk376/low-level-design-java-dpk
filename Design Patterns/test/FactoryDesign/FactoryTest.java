import org.junit.jupiter.api.Test;
import db.Database;
import db.MySqlDb;
import db.MongoDb;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {
    @Test
    public void testFactoryProvider() {
        Database mysql = DatabaseFactoryProvider.getDatabase("mysql");
        assertTrue(mysql instanceof MySqlDb);
        
        Database mongo = DatabaseFactoryProvider.getDatabase("mongodb");
        assertTrue(mongo instanceof MongoDb);
    }
}
