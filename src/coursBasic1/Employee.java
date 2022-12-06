package coursBasic1;

import java.lang.reflect.Array;
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

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return id + ". Сотрудник " + nameEmployee + ", отдел " + department + ", получает зарплату - " + salary + "р.";
    }

    private static String separator = "===========================";

    public static String getSeparator() {
        return separator;
    }

    public static double calculationSumSalaryInMonth(Employee[] employees) {
        double sumSalaryInMonth = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalaryInMonth += employee.getSalary();
            }
        }
        return sumSalaryInMonth;
    }

    public static double middleMealsSalaries(Employee[] employees) {
        double middleMealsSalary;
        int countEmployee = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                countEmployee++;
            }
        }
        middleMealsSalary = calculationSumSalaryInMonth(employees) / countEmployee;
        return middleMealsSalary;
    }

    public static void findEmployeeWithMinSalary(Employee[] employees) {
        double minSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > minSalary) {
                    minSalary = employee.getSalary();
                    break;
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
                    System.out.println("Самую высокую зарплату " + value.getSalary() + "р. получает " + value.getNameEmployee());
                }
            }
        }
    }

    public static void listNameEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.id + ". " + employee.getNameEmployee());
            }
        }
    }

    public static void correctSalary(Employee[] employees, double index) {
        double novaSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                novaSalary = employee.getSalary() + (employee.getSalary() / 100 * index);
                System.out.println(employee.id + ". " + employee.getNameEmployee() + " " + employee.getDepartment() + " отдел. Зарплата увеличилась на " + index + "%, и составила " + novaSalary + "р. ");
            }
        }
    }

    public static void maxSalaryOfDepartment(Employee[] employees, int numDepartment) {
        double maxSalaryDepartment = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == numDepartment) {
                    if (employee.getSalary() > maxSalaryDepartment) {
                        maxSalaryDepartment = employee.getSalary();
                    }
                }
            }
        }
        for (Employee value : employees) {
            if (value != null) {
                if (maxSalaryDepartment == value.getSalary()) {
                    System.out.println(Employee.getSeparator() + "\nСамую высокую зарплату в " + numDepartment + " отделе - " + value.getSalary() + "р. получает " + value.getNameEmployee());
                }
            }
        }
    }

    public static void minSalaryOfDepartment(Employee[] employees, int numDepartment) {
        double minSalaryDepartment = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == numDepartment) {
                    if (employee.getSalary() > minSalaryDepartment) {
                        minSalaryDepartment = employee.getSalary();
                        break;
                    }
                }
            }
        }
        for (Employee value : employees) {
            if (value != null) {
                if (minSalaryDepartment == value.getSalary()) {
                    System.out.println("Самую низкую зарплату в " + value.getDepartment() + " отделе - " + value.getSalary() + "р. получает " + value.getNameEmployee() + "\n" + Employee.getSeparator());
                }
            }
        }
    }

    public static double calculationSumSalaryOfDepartment(Employee[] employees, int numDepartment) {
        double sumSalaryOfDepartment = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == numDepartment) {
                    sumSalaryOfDepartment = sumSalaryOfDepartment + employee.getSalary();
                }
            }
        }
        return sumSalaryOfDepartment;
    }

    public static double middleSalaryOfDepartment(Employee[] employees, int numDepartment) {
        double middleMealsSalaryOfDepartment;
        int countEmployee = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == numDepartment) {
                    countEmployee++;
                }
            }
        }
        middleMealsSalaryOfDepartment = calculationSumSalaryOfDepartment(employees, numDepartment) / countEmployee;
        return middleMealsSalaryOfDepartment;
    }

    public static void employeeOfDepartment(Employee[] employees, int numDepartment) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == numDepartment) {
                    System.out.println(employee.id + ". " + employee.getNameEmployee() + " " + ", зарплата - " + employee.getSalary() + "р. ");
                }
            }
        }
    }

    public static void salaryLessChoice(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < number) {
                    System.out.println(employee.id + ". " + employee.getNameEmployee() + " " + ", зарплата - " + employee.getSalary() + "р. ");

                }
            }
        }
    }

    public static void salaryMoreChoice(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() >= number) {
                    System.out.println(employee.id + ". " + employee.getNameEmployee() + " " + ", зарплата - " + employee.getSalary() + "р. ");

                }
            }
        }
    }

    public static void correctSalaryOfDepartment(Employee[] employees, int numDepartment, double index) {
        double novaSalaryOfDepartment = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == numDepartment) {
                    novaSalaryOfDepartment = employee.getSalary() + (employee.getSalary() / 100 * index);
                    System.out.println(employee.nameEmployee + ", " + numDepartment + " отдел, зарплата увеличилась на " + index + "% и составила " + novaSalaryOfDepartment + "р. ");
                }
            }
        }
    }
}