package Employee;

import App.Main;
import Company.Company;

public class TopManager extends EmployeeAbstract{
    public static final double MIN_SALARY = 300000;
    public static final double MAX_SALARY = 400000;
    private static final double bonusCoeff = 1.5;
    public TopManager(String name, double fixMonthSalary, Company company) {
        super(name, fixMonthSalary, company);
    }

    @Override
    public double getMonthSalary() {
        if (company.getIncome() > Company.GOOD_INCOME_MONTH_RESULT) {
            return Double.parseDouble(Main.DECIMAL_FORMAT.format(fixMonthSalary + bonusCoeff * fixMonthSalary));
        }
        return Double.parseDouble(Main.DECIMAL_FORMAT.format(fixMonthSalary));
    }
}
