package adapter;

public class YesBankAPI {

    public int checkBalance(BankAccount bankAccount) {
        return bankAccount.getBalance();
    }

    public void sendMoney(BankAccount sender, BankAccount receiver, int amount, String token) {
        sender.setBalance(sender.getBalance()-amount);
        receiver.setBalance(receiver.getBalance()+amount);
        System.out.println("Transaction done from YES Bank");
    }
}
