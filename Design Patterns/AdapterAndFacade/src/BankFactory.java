import adapter.BankAPI;
import adapter.IciciBankAdapter;
import adapter.YesBankAdapter;

public class BankFactory {

    public static BankAPI getBank(String bankName) {
        if(bankName.equalsIgnoreCase("yes bank")) {
            return new YesBankAdapter();
        }
        else if(bankName.equalsIgnoreCase("icici")) {
            return new IciciBankAdapter();
        }
        return null;
    }
}
