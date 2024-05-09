package BankAccounts;

public class BankAccount {
    protected double amount;

    public BankAccount() {
        amount = 0;
    }

    public double getAmount() {
        return amount;
    }

    public void put(double amount) {
        if (amount > 0) {
            this.amount += amount;
        } else {
            System.out.println("Введите положительную сумму");
        }
    }

    public void take(double amount) {
        if (amount > 0 && amount < this.amount) {
            this.amount -= amount;
        } else {
            System.out.println("Не возможно выполнить снятие");
        }
    }

}
