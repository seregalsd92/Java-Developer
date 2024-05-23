package App;

import Company.Company;
import Employee.Employee;
import Employee.Operator;
import Employee.Manager;
import Employee.TopManager;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.##");
    public static void main(String[] args) {
        Company lsdCompany = new Company("Lapin's life");
        Init.initCompany(lsdCompany, 180, 80, 10);
        ArrayList<Employee> topSalaryStaff = lsdCompany.getTopSalaryStaff(20);
        ArrayList<Employee> lowSalaryStaff = lsdCompany.getLowestSalaryStaff(30);

        System.out.println(lsdCompany);
        System.out.println("\nСписок наивысших зарплат");
        for (Employee employee : topSalaryStaff) {
            System.out.println(employee.getName() + " - " + employee.getMonthSalary() + " руб.");
        }
        System.out.println("\nСписок наименьших зарплат");
        for (Employee employee : lowSalaryStaff) {
            System.out.println(employee.getName() + " - " + employee.getMonthSalary() + " руб.");
        }

        ArrayList<Employee> lsdCompEmployees = new ArrayList<>(lsdCompany.getEmployees());
        for (int i = 0; i < lsdCompEmployees.size(); i = i+2) {
            lsdCompany.fire(lsdCompEmployees.get(i));
        }
        ArrayList<Employee> topSalaryStaff2 = lsdCompany.getTopSalaryStaff(20);
        ArrayList<Employee> lowSalaryStaff2 = lsdCompany.getLowestSalaryStaff(30);

        System.out.println(lsdCompany);
        System.out.println("\nСписок наивысших зарплат");
        for (Employee employee : topSalaryStaff2) {
            System.out.println(employee.getName() + " - " + employee.getMonthSalary() + " руб.");
        }
        System.out.println("\nСписок наименьших зарплат");
        for (Employee employee : lowSalaryStaff2) {
            System.out.println(employee.getName() + " - " + employee.getMonthSalary() + " руб.");
        }

        Company ljaCompany = new Company("Julia's pleasure");
        Init.initCompany(ljaCompany, 150, 50, 15);
        ArrayList<Employee> topSalaryStaff3 = ljaCompany.getTopSalaryStaff(20);
        ArrayList<Employee> lowSalaryStaff3 = ljaCompany.getLowestSalaryStaff(30);

        System.out.println(ljaCompany);
        System.out.println("\nСписок наивысших зарплат");
        for (Employee employee : topSalaryStaff3) {
            System.out.println(employee.getName() + " - " + employee.getMonthSalary() + " руб.");
        }
        System.out.println("\nСписок наименьших зарплат");
        for (Employee employee : lowSalaryStaff3) {
            System.out.println(employee.getName() + " - " + employee.getMonthSalary() + " руб.");
        }

        ljaCompany.fireAll(topSalaryStaff3);
        ArrayList<Employee> topSalaryStaff4 = ljaCompany.getTopSalaryStaff(20);
        ArrayList<Employee> lowSalaryStaff4 = ljaCompany.getLowestSalaryStaff(30);

        System.out.println(ljaCompany);
        System.out.println("\nСписок наивысших зарплат");
        for (Employee employee : topSalaryStaff4) {
            System.out.println(employee.getName() + " - " + employee.getMonthSalary() + " руб.");
        }
        System.out.println("\nСписок наименьших зарплат");
        for (Employee employee : lowSalaryStaff4) {
            System.out.println(employee.getName() + " - " + employee.getMonthSalary() + " руб.");
        }
    }

    public static double getRandomInInterval(double min, double max) {
        return min + (max - min) * Math.random();
    }

    private static class Init {
        public static void initCompany(Company company, int operatorsCount, int ManagerCount, int topManagerCount) {
            ArrayList<Employee> operators = new ArrayList<>();
            ArrayList<Employee> managers = new ArrayList<>();
            for (int i = 0; i < operatorsCount; i++) {
                operators.add(new Operator("Operator ".concat(Integer.toString(i)), getRandomInInterval(Operator.MIN_SALARY, Operator.MAX_SALARY), company));
            }
            company.hireAll(operators);
            for (int i = 0; i < ManagerCount; i++) {
                managers.add(new Manager("Manager ".concat(Integer.toString(i)), getRandomInInterval(Manager.MIN_SALARY, Manager.MAX_SALARY), company));
            }
            company.hireAll(managers);
            for (int i = 0; i < topManagerCount; i++) {
                company.hire(new TopManager("TopManager ".concat(Integer.toString(i)), getRandomInInterval(TopManager.MIN_SALARY, TopManager.MAX_SALARY),company));
            }
        }
    }
}
