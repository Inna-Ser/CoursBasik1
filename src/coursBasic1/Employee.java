package coursBasic1;

import java.util.Arrays;

public class Employee {
    private String nameEmployee;
    private double salary;
    private int department;
    private static int count = 1;
    private final int id;

    public Employee(String nameEmployee, int department, double salary) {
        this.nameEmployee = nameEmployee;
        this.department = department;
        this.salary = salary;
        id = count;
        count++;
    }

    public static int getNumOfInstances() {
        return count;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return id + ". Сотрудник " + nameEmployee + " из отдела " + department + " получает зарплату - " + salary + "р.";
    }

    public static double calculationSumSalaryInMonth(Employee[] employees) {
        double sumSalaryInMonth = 0;
        for (Employee employee : employees) {
            sumSalaryInMonth = sumSalaryInMonth += employee.salary;
        }
        return sumSalaryInMonth;
    }

    public static double middleMintSalaries(Employee[] employees) {
        double middleMealsSalary = 0;
        for (Employee employee : employees) {
            middleMealsSalary = calculationSumSalaryInMonth(employees) / employees.length;
        }
        return middleMealsSalary;
    }

    public static void findEmployeeWithMinSalary(Employee[] employees) {
        double minSalary = 1_000_000;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                }
            }
        }
        for (Employee value : employees) {
            if (value != null) {
                if (minSalary == value.getSalary()) {
                    System.out.println("Самую низкую зарплату " + value.getSalary() + "р. получает " + value.getNameEmployee());
                }
            }
        }
    }

    public static void findEmployeeWithMaxSalary(Employee[] employees) {
        double maxSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                }
            }
        }
        for (Employee value : employees) {
            if (value != null) {
                if (maxSalary == value.getSalary()) {
                    System.out.println("Самую высокую зарплату " + value.getSalary() + "р. получает " + value.getNameEmployee() + "\n");
                }
            }
        }
    }

    public static void listNameEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.id + ". " + employee.getNameEmployee());
        }
    }
}
