package bank;

/**
 * Client class to demonstrate the usage of the BankAccount class.
 */
public class Client {

    public static void main(String[] args) {
        // Create a new BankAccount instance
        BankAccount account = new BankAccount();

        // Using encapsulation: Accessing fields via getters and setters
        account.setOwnerName("Deepak");
        account.setBalance(5000);
        account.setRateOfInterest(5);

        System.out.println("Account Owner: " + account.getOwnerName());
        System.out.println("Initial Balance: " + account.getBalance());

        // Demonstrating business logic methods
        System.out.println("\n--- Performing Transactions ---");
        account.deposit(2500);
        account.withdraw(1000);

        // Demonstrating validation failures (these would throw exceptions in a real scenario)
        try {
            account.withdraw(10000);
        } catch (IllegalArgumentException e) {
            System.out.println("Expected error on over-withdrawal: " + e.getMessage());
        }
    }
}
