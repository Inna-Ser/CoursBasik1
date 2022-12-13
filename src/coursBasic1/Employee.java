package coursBasic1;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.nio.file.NotDirectoryException;
import java.util.Arrays;

public class Employee {
    private String fullName;
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

        fullName = lastName + " " + firstName + " " + patronymic;
        id = count;
        count++;
    }

    // геттеры

    public String getFullName() {  // объединяем Ф.И.О. в перемменную для удобства
        return fullName;
    }

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
        return id + ". Сотрудник " + getFullName() + ", отдел " + department + ", получает зарплату - " + salary;
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
                    System.out.println("Самую низкую зарплату " + value.getSalary() + " получает " + value.getFullName());

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
                    System.out.println("Самую высокую зарплату " + value.getSalary() + " получает " + value.getFullName());
                }
            }
        }
    }

    public static void listNameEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.id + ". " + employee.getFullName());
            }
        }
    }

    public static void correctSalary(Employee[] employees, double index) {
        double novaSalary;
        for (Employee employee : employees) {
            if (employee != null) {
                novaSalary = employee.getSalary() + (employee.getSalary() / 100 * index);
                System.out.println(employee.id + " " + employee.getFullName() + " " + employee.getDepartment() + " отдел. Зарплата увеличилась на " + index + "%, и составила " + novaSalary);
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
                    }
                }
            }
        }
        for (Employee value : employees) {
            if (value != null) {
                if (minSalaryDepartment == value.getSalary()) {
                    System.out.println("Самую низкую зарплату в " + numDepartment + " отделе - " + value.getSalary() + " получает " + value.getFullName());
                }
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
                        break;
                    }
                }
            }
        }
        for (Employee value : employees) {
            if (value != null) {
                if (maxSalaryDepartment == value.getSalary()) {
                    System.out.println("Самую высокую зарплату в " + value.getDepartment() + " отделе - " + value.getSalary() + " получает " + value.getFullName());
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
                    System.out.println(employee.id + ". " + employee.getFullName() + ", зарплата - " + employee.getSalary());
                }
            }
        }
    }

    public static void salaryLessChoice(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < number) {
                    System.out.println(employee.id + ". " + employee.getFullName() + " " + employee.getDepartment() + " отдел, зарплата - " + employee.getSalary());
                }
            }
        }
    }

    public static void salaryMoreChoice(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() >= number) {
                    System.out.println(employee.id + ". " + employee.getFullName() + " " + employee.getDepartment() + " отдел, зарплата - " + employee.getSalary());
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
                    System.out.println(employee.getFullName() + ", " + numDepartment + " отдел, зарплата увеличилась на " + index + "% и составила " + novaSalaryOfDepartment);
                }
            }
        }
    }
}