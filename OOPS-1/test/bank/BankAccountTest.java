package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testValidInitialBalance() {
        BankAccount account = new BankAccount();
        account.setBalance(5000);
        assertEquals(5000, account.getBalance());
    }

    @Test
    public void testInvalidInitialBalance() {
        BankAccount account = new BankAccount();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            account.setBalance(15000);
        });
        assertEquals("Initial balance cannot exceed 10000", exception.getMessage());
    }
    
    @Test
    public void testNegativeInitialBalance() {
        BankAccount account = new BankAccount();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            account.setBalance(-500);
        });
        assertEquals("Balance cannot be negative", exception.getMessage());
    }

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount();
        account.setBalance(1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    public void testInvalidDeposit() {
        BankAccount account = new BankAccount();
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-100);
        });
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount();
        account.setBalance(2000);
        account.withdraw(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    public void testOverWithdraw() {
        BankAccount account = new BankAccount();
        account.setBalance(1000);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(1500);
        });
        assertEquals("Insufficient funds for withdrawal", exception.getMessage());
    }
}
