
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args)
    {
        Account bertsAccount = new Account("Bert's Account", 100.00);
        bertsAccount.deposit(20.00);
        System.out.println(bertsAccount);
    }

}
