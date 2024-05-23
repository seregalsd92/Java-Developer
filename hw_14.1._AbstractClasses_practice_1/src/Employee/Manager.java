package Employee;

import App.Main;
import Company.Company;

public class Manager extends EmployeeAbstract{
    public static final double MIN_SALARY = 100000;
    public static final double MAX_SALARY = 120000;
    private static final double minMonthEarn = 115000;
    private static final double maxMonthEarn = 140000;
    private static final double bonusCoeff = 0.05;
    private double incomeMonthEarn;

    public Manager(String name, double fixMonthSalary, Company company) {
        super(name, fixMonthSalary, company);
        incomeMonthEarn = Main.getRandomInInterval(minMonthEarn, maxMonthEarn);
    }

    public double getIncomeMonthEarn() {
        return incomeMonthEarn;
    }

    public void generateIncomeMonthEarn() {
        incomeMonthEarn = Main.getRandomInInterval(minMonthEarn, maxMonthEarn);
    }

    @Override
    public double getMonthSalary() {
        return Double.parseDouble(Main.DECIMAL_FORMAT.format(fixMonthSalary + bonusCoeff * incomeMonthEarn));
    }
}
