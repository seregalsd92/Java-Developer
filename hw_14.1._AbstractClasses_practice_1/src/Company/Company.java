package Company;

import Employee.Employee;
import Employee.Manager;

import java.util.*;

public class Company {
    public static final double GOOD_INCOME_MONTH_RESULT = 10_000_000;
    private String name;
    private ArrayList<Employee> employees;

    public Company (String name) {
        employees = new ArrayList<>();
        this.name = name;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(Collection<Employee> employeeList) {
        employees.addAll(employeeList);
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public void fireAll(Collection<Employee> employeeList) {
        for (Employee employee : employeeList) { // TODO посмотреть как работает. Скорее всего работает, т.к. удаляю не из того списка, который обхожу. Попробовать применить итератор
            employees.remove(employee);
        }
    }
    public ArrayList<Employee> getTopSalaryStaff(int count) {
        if (count > 0 && count < employees.size()) {
            Collections.sort(employees);
            Collections.reverse(employees);
            return new ArrayList<>(employees.subList(0,count));
        }
        return new ArrayList<>();
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) {
        if (count > 0 && count < employees.size()) {
            Collections.sort(employees);
            return new ArrayList<>(employees.subList(0,count));
        }
        return new ArrayList<>();
    }

    public double getIncome() {
        double income = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                income += ((Manager) employee).getIncomeMonthEarn();
            }
        }
        return income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }


    @Override
    public String toString() {
        return "\nКоличество сотрудников компании \"" + getName() + "\" - " + getEmployees().size() +
                "\nВходящий месячный доход компании = " + (long) getIncome() + " руб.";
    }

}
