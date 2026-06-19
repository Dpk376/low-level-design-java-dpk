package adapter;

public class IciciBankAdapter implements BankAPI{

    private IciciBankAPI iciciBankAPI;

    public IciciBankAdapter() {
        this.iciciBankAPI = new IciciBankAPI();
    }

    @Override
    public int fetchBalance(BankAccount account) {
        return iciciBankAPI.seeBalance(account);
    }

    @Override
    public void doTransaction(BankAccount sender, BankAccount receiver, int amount) {
        iciciBankAPI.pay(sender,receiver,amount);
    }
}
