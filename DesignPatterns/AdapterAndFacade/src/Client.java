import adapter.BankAPI;
import adapter.BankAccount;
import adapter.IciciBankAdapter;
import adapter.YesBankAdapter;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bankName =  sc.nextLine();
        BankAPI bankAPI = BankFactory.getBank(bankName);

        Phonepe phonepe = new Phonepe(bankAPI);
        BankAccount account1 = new BankAccount(1,"Virat",1000);
        BankAccount account2 =  new BankAccount(2, "Rohit", 2000);

        phonepe.upiTransaction(account1,account2,500);
    }
}
