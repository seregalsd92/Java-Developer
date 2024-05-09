import BankAccounts.BankAccount;
import BankAccounts.CardAccount;
import BankAccounts.DepositAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.put(200);
        System.out.println(bankAccount.getAmount());
        bankAccount.take(100);
        System.out.println(bankAccount.getAmount());

        CardAccount cardAccount = new CardAccount();
        cardAccount.put(1000);
        cardAccount.take(1000);
        System.out.println(cardAccount.getAmount());
        cardAccount.take(900);
        System.out.println(cardAccount.getAmount());

        DepositAccount depositAccount = new DepositAccount();
        depositAccount.put(500);
        depositAccount.take(200);
        System.out.println(depositAccount.getAmount());
    }
}
