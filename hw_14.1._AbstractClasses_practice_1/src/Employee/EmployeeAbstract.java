package Employee;

import Company.Company;

import java.util.UUID;

public abstract class EmployeeAbstract
        implements Employee {
    protected final UUID uuid;
    protected String name;
    protected double fixMonthSalary;
    public Company company;

    public EmployeeAbstract(String name, double fixMonthSalary, Company company) {
        uuid = UUID.randomUUID();
        this.name = name;
        this.fixMonthSalary = fixMonthSalary;
        this.company = company;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFixMonthSalary() {
        return fixMonthSalary;
    }

    public void setFixMonthSalary(double fixMonthSalary) {
        this.fixMonthSalary = fixMonthSalary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public int compareTo(Employee employee) {
        return Double.compare(getMonthSalary(),employee.getMonthSalary());
    }
}
