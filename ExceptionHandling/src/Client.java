import java.sql.SQLException;

/**
 * Client class demonstrating exception handling.
 */
public class Client {

    /**
     * Main method.
     *
     * @param args command line arguments
     * @throws SQLException if a database error occurs and is not handled
     */
    public static void main(String[] args) throws SQLException {

        System.out.println("A");

        try {
            Calculator.doSomething(4);
        } catch (Exception e) {
            System.err.println("An error occurred while doing something: " + e.getMessage());
        } finally {
            System.out.println("D");
        }
    }
}
