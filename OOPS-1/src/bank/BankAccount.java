package bank;

/**
 * Represents a basic bank account with deposit and withdrawal capabilities.
 * Demonstrates data encapsulation and validation.
 */
public class BankAccount {

    private String ownerName;
    private double balance;
    private int rateOfInterest;

    /**
     * Gets the current balance.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the balance of the account.
     * Validates that the initial balance isn't excessively large for a new setup.
     *
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        if (balance > 10000) {
            throw new IllegalArgumentException("Initial balance cannot exceed 10000");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    /**
     * Gets the owner's name.
     *
     * @return the owner's name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the owner's name.
     *
     * @param name the owner's name
     */
    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    /**
     * Gets the rate of interest.
     *
     * @return the rate of interest
     */
    public int getRateOfInterest() {
        return rateOfInterest;
    }

    /**
     * Sets the rate of interest.
     *
     * @param rateOfInterest the rate of interest to set
     */
    public void setRateOfInterest(int rateOfInterest) {
        if (rateOfInterest < 0) {
            throw new IllegalArgumentException("Rate of interest cannot be negative");
        }
        this.rateOfInterest = rateOfInterest;
    }

    /**
     * Deposits a specified amount into the account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be strictly positive");
        }
        balance += amount;
        System.out.println("Owner name: " + ownerName);
        System.out.println("Updated balance after deposit: " + balance);
    }

    /**
     * Withdraws a specified amount from the account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be strictly positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds for withdrawal");
        }
        balance -= amount;
        System.out.println("Updated balance after withdrawal: " + balance);
    }
}
