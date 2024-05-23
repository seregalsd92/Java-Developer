package Employee;

import Company.Company;

import java.util.UUID;

public interface Employee extends Comparable<Employee> {
    UUID getUuid();
    String getName();
    void setName(String name);
    double getFixMonthSalary();
    void setFixMonthSalary(double fixMonthSalary);
    Company getCompany();
    void setCompany(Company company);
    double getMonthSalary();
}
