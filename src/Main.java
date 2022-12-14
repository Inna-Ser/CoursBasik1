import coursBasic1.Employee;
import jdk.jfr.Name;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 55_000);
        employees[1] = new Employee("Козлов", "Сергей", "Анатольевич", 3, 65_000);
        employees[2] = new Employee("Пирогова", "Вера", "Семеновна", 5, 110_000);
        employees[3] = new Employee("Плотников", "Абрам", "Васильевич", 1, 51_000);
        employees[4] = new Employee("Голубев", "Поликарп", "Поликарпович", 4, 126_000);
        employees[5] = new Employee("Дубай", "Елена", "Сергеевна", 2, 95_000);
        employees[5] = new Employee("Кравцова", "Антонина", "Альбертовна", 3, 68_000);
        employees[6] = new Employee("Поликарпов", "Артем", "Борисовичч", 5, 30_000);
        employees[7] = new Employee("Губин", "Виталий", "Денисович", 2, 90_000);
        employees[8] = new Employee("Ивлева", "Анфиса", "Борисовна", 4, 79_000);
        employees[9] = new Employee("Аксенов", "Леонид", "Михайлович", 2, 88_900);

        for (Employee employee : employees) { // вывод массива сотрудников списком
            System.out.println(employee);
        }

        System.out.println(Employee.getSeparator(employees));
        System.out.println("Общая сумма зарплаты сотрудников за месяц - " + Employee.calculationSumSalaryInMonth(employees));
        System.out.println(Employee.getSeparator(employees));
        // реализуем метод нахождения средней зарплаты всех сотрудников за месяц
        Employee.middleMealsSalaries(employees);
        System.out.println("\n" + Employee.getSeparator(employees));
        // реализуем метод нахождения сотрудника с самой низкой зп
        Employee.findEmployeeWithMinSalary(employees);
        System.out.println(Employee.getSeparator(employees));
        // реализуем метод нахождения сотрудника с самой высокой зп
        Employee.findEmployeeWithMaxSalary(employees);
        System.out.println(Employee.getSeparator(employees));
        // реализуем метод вывода Ф.И.О.
        Employee.listNameEmployee(employees);
        System.out.println(Employee.getSeparator(employees));
        // реализуем метод индексирования зарплаты
        Employee.correctSalary(employees, 10);
        System.out.println(Employee.getSeparator(employees));
        // реализуем метод выборки самой низкой зп по отделам
        Employee.minSalaryOfDepartment(employees, 2);
        System.out.println(Employee.getSeparator(employees));
        // реализуем метод выборки самой ввысокой зп по отделам
        Employee.maxSalaryOfDepartment(employees, 3);
        System.out.println(Employee.getSeparator(employees));
        // реализация метода нахождения суммы зп по отделам
        System.out.println("Сумма зарплат по отделу " + Employee.calculationSumSalaryOfDepartment(employees, 5));
        System.out.println(Employee.getSeparator(employees));
        // реализация метода нахождения среднего значения зп по отделу
        Employee.middleSalaryOfDepartment(employees, 5);
        System.out.println("\n" + Employee.getSeparator(employees));
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

