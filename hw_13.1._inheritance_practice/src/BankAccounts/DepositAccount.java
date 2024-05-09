package BankAccounts;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;
    public DepositAccount() {
        super();
        lastIncome = LocalDate.of(1970,1,1);
    }

    @Override
    public void take(double amount) {
        LocalDate now = LocalDate.now();
        if (now.minusMonths(1).isAfter(lastIncome)) {
            super.take(amount);
        } else {
            System.out.println("Деньги лежат меньше месяца, снятие не возможно");
        }
    }

    @Override
    public void put(double amount) {
        super.put(amount);
        lastIncome = LocalDate.now().minusMonths(1).minusDays(1);
    }
}
