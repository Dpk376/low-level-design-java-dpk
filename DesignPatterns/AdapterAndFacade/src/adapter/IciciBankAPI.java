package adapter;

public class IciciBankAPI {

    public int seeBalance(BankAccount bankAccount) {
        return bankAccount.getBalance();
    }

    public void pay(BankAccount sender, BankAccount receiver, int amount) {
        sender.setBalance(sender.getBalance()-amount);
        receiver.setBalance(receiver.getBalance()+amount);
        System.out.println("Transaction done from ICICI bank");
    }
}
