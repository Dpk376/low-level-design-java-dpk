package p2;

import bank.BankAccount;

/**
 * Client class in a different package to demonstrate access modifiers.
 */
public class Client {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        // Since BankAccount fields are private, we must use public getters/setters.
        account.setRateOfInterest(1);
        System.out.println("Rate of interest set to: " + account.getRateOfInterest());
    }
}
