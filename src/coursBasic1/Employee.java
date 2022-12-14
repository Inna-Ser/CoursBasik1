package coursBasic1;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.nio.file.NotDirectoryException;
import java.util.Arrays;

public class Employee {
    private String lastName;
    private String firstName;
    private String patronymic;
    private double salary;
    private int department;
    private static int count = 1;
    private final int id;
    private double index;

    public Employee(String lastName, String firstName, String patronymic, int department, double salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        id = count;
        count++;
    }

    // геттеры
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public double getIndex() {
        return index;
    }

    // сеттеры
    public void setLastName() {
        this.lastName = lastName;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public void setPatronymic() {
        this.patronymic = patronymic;
    }

    public void setIndex() {
        this.index = index;
    }

    // сеттеры/выводы ошибок
    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Нельзя начислять зарплату меньше 0.0р.");
        }
        this.salary = salary;
    }

    public void setDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого отдела не существует. Проерьте вводные данные");
        }
        this.department = department;
    }

    @Override
    public String toString() {
        return id + ". Сотрудник " + getLastName() + " " + getFirstName() + " " + getPatronymic() + ", отдел " + department + ", получает зарплату - " + salary;
    }

    // разделитель
    public static String getSeparator(Employee[] employees) {
        return "================================";
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

    public static void middleMealsSalaries(Employee[] employees) {
        double middleMealsSalary;
        int countEmployee = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                countEmployee++;
            }
        }
        middleMealsSalary = calculationSumSalaryInMonth(employees) / countEmployee;
        System.out.printf("Средняя зарплата сотрудников за месяц составляет " + "%.1f", middleMealsSalary);
    }

    public static void findEmployeeWithMinSalary(Employee[] employees) {
        double minSalary = 0;
        Employee foundEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > minSalary) {
                    minSalary = employee.getSalary();
                    foundEmployee = employee;
                    break;
                }
            }
        }
        System.out.println(foundEmployee + " это самая низкая зарплата");
    }

    public static void findEmployeeWithMaxSalary(Employee[] employees) {
        double maxSalary = 0;
        Employee foundEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    foundEmployee = employee;
                }
            }
        }
        System.out.println(foundEmployee + " это самая высокая зарплата");
    }

    public static void listNameEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.id + ". " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getPatronymic());
            }
        }
    }

    public static void correctSalary(Employee[] employees, double index) {
        double novaSalary;
        for (Employee employee : employees) {
            if (employee != null) {
                novaSalary = employee.getSalary() + (employee.getSalary() / 100 * index);
                System.out.println(employee.id + " " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getPatronymic() + " " + employee.getDepartment() + " отдел. Зарплата увеличилась на " + index + "%, и составила " + novaSalary);
            }
        }
    }

    public static void minSalaryOfDepartment(Employee[] employees, int numDepartment) {
        double minSalaryOfDepartment = 0;
        Employee foundEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == numDepartment) {
                    if (employee.getSalary() > minSalaryOfDepartment) {
                        minSalaryOfDepartment = employee.getSalary();
                        foundEmployee = employee;
                        break;
                    }
                }
            }
        }
        System.out.println(foundEmployee + " это самая низкая зарплата в отделе");
    }

    public static void maxSalaryOfDepartment(Employee[] employees, int numDepartment) {
        double maxSalaryOfDepartment = 0;
        Employee foundEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == numDepartment) {
                    if (employee.getSalary() > maxSalaryOfDepartment) {
                        maxSalaryOfDepartment = employee.getSalary();
                        foundEmployee = employee;
                    }
                }
            }
        }
        System.out.println(foundEmployee + " это самая высокая зарплата в отделе");
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

    public static void middleSalaryOfDepartment(Employee[] employees, int numDepartment) {
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
        System.out.printf("Средняя зарплата по " + numDepartment + "-му отделу - " + "%.1f", middleMealsSalaryOfDepartment);
    }

    public static void employeeOfDepartment(Employee[] employees, int numDepartment) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == numDepartment) {
                    System.out.println(employee.id + ". " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getPatronymic() + ", зарплата - " + employee.getSalary());
                }
            }
        }
    }

    public static void salaryLessChoice(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < number) {
                    System.out.println(employee.id + ". " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getPatronymic() + " " + employee.getDepartment() + " отдел, зарплата - " + employee.getSalary());
                }
            }
        }
    }

    public static void salaryMoreChoice(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() >= number) {
                    System.out.println(employee.id + ". " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getPatronymic() + " " + employee.getDepartment() + " отдел, зарплата - " + employee.getSalary());
                }
            }
        }
    }

    public static void correctSalaryOfDepartment(Employee[] employees, int numDepartment, double index) {
        double novaSalaryOfDepartment = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == numDepartment) {
                novaSalaryOfDepartment = employee.getSalary() + (employee.getSalary() / 100 * index);
                System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getPatronymic() + ", " + numDepartment + " отдел, зарплата увеличилась на " + index + "% и составила " + novaSalaryOfDepartment);
            }
        }
    }
}
