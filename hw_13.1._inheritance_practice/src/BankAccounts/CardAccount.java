package BankAccounts;

public class CardAccount extends BankAccount {
    public static final double TAKE_COMISSION = 0.01;
    public CardAccount () {
    }

    @Override
    public void take(double amount) {
        double totalComission = 1 + TAKE_COMISSION;
        if (amount > 0 && totalComission * amount < this.amount) {
            this.amount -= totalComission * amount;
        } else {
            System.out.println("Не возможно выполнить снятие");
        }
    }
}
