import adapter.BankAPI;
import adapter.BankAccount;

public class Phonepe {

    private BankAPI bankAPI;

    public Phonepe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public void upiTransaction(BankAccount sender, BankAccount receiver, int amount) {
        if(bankAPI.fetchBalance(sender) < amount) {
            throw new RuntimeException("Insufficient balance");
        }
        bankAPI.doTransaction(sender,receiver,amount);
    }
}
