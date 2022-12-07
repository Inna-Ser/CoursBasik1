import coursBasic1.Employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 55_000);
        employees[1] = new Employee("Петров Семен Вфсильевич", 3, 65_000);
        employees[2] = new Employee("Козлов Василий Васильевич", 5, 110_000);
        employees[3] = new Employee("Ивашкина Галина Альбертовна", 1, 51_000);
        employees[4] = new Employee("Дунай Инна Семеновна", 4, 126_000);
        employees[5] = new Employee("Груздь Поликарп Поликарпович", 4, 45_000);
        employees[6] = new Employee("Кленов Валерий Афанасьевич", 2, 95_000);
        employees[7] = new Employee("Кулибин Леонид Дмитриевич", 3, 68_000);
        employees[8] = new Employee("Голубев Николай Абрамович", 5, 30_000);
        employees[9] = new Employee("Твардовский Михаил Борисович", 2, 90_000);

        for (Employee employee : employees) { // вывод массива сотрудников списком
            System.out.println(employee);
        }
        System.out.println(Employee.getSeparator(employees));
        System.out.println("Общая сумма зарплаты сотрудников за месяц - " + Employee.calculationSumSalaryInMonth(employees) + "р.");
        System.out.println(Employee.getSeparator(employees));
        System.out.println("Средняя зарплата за месяц составила - " + Employee.middleMealsSalaries(employees) + "р.");
        System.out.println(Employee.getSeparator(employees));
    // реализуем метод нахождения сотрудника с самой низкой зп
        Employee.findEmployeeWithMinSalary(employees);
        System.out.println(Employee.getSeparator(employees));
    // реализуем метод нахождения сотрудника с самой высокой зп
        Employee.findEmployeeWithMaxSalary(employees);
        System.out.println(Employee.getSeparator(employees));
    // реализуем метод рапечатывааниия Ф.И.О.
        Employee.listNameEmployee(employees);
        System.out.println(Employee.getSeparator(employees));
    // реализуем метод индексирования зарплаты
        Employee.correctSalary(employees, 10);
        System.out.println(Employee.getSeparator(employees));
    // реализуем метод выборки зп по отделам
        Employee.minSalaryOfDepartment(employees, 1);
        System.out.println(Employee.getSeparator(employees));
    // реализуем метод выборки зп по отделам
        Employee.maxSalaryOfDepartment(employees, 4);
        System.out.println(Employee.getSeparator(employees));
    // реализация метода нахождения суммы зп по отделам
        System.out.println("Сумма зарплат по отделу - " + Employee.calculationSumSalaryOfDepartment(employees, 5));
        System.out.println(Employee.getSeparator(employees));
    // реализация метода нахождения среднего значения зп по отделу
        System.out.println("Средняя зарплата по отделу - " + Employee.middleSalaryOfDepartment(employees, 5));
        System.out.println(Employee.getSeparator(employees));
    // реализация метода нахождения сотрудников по отделам
        Employee.employeeOfDepartment(employees, 2);
        System.out.println(Employee.getSeparator(employees));
    // реализация метода нахождения сотрудников с зарплатой больше заданного числа
        Employee.salaryLessChoice(employees, 70_000);
        System.out.println(Employee.getSeparator(employees));
    // реализация метода нахождения сотрудников с зарплатой больше заданного числа
        Employee.salaryMoreChoice(employees, 60_000);
        System.out.println(Employee.getSeparator(employees));
    // реаализация метода увеличения зарпплаты на % по отделам
        Employee.correctSalaryOfDepartment(employees, 3, 1.15);


    }
}
