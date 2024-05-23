package Employee;

import App.Main;
import Company.Company;

public class Operator extends EmployeeAbstract {
    public static final double MIN_SALARY = 50000;
    public static final double MAX_SALARY = 60000;
    public Operator(String name, double fixMonthSalary, Company company) {
        super(name, fixMonthSalary, company);
    }

    @Override
    public double getMonthSalary() {
        return Double.parseDouble(Main.DECIMAL_FORMAT.format(fixMonthSalary));
    }
}
