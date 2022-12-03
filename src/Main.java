import coursBasic1.Employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов Иван Иванович", 1, 50_000);
        employees[1] = new Employee("Петров Семен Васильевич", 3, 65_000);
        employees[2] = new Employee("Козлов Василий Васильевич", 1, 110_000);
        employees[3] = new Employee("Ивашкина Галина Альбертовна", 1, 50_000);
        employees[4] = new Employee("Дунай Инна Семеновна", 4, 26_000);
        employees[5] = new Employee("Груздь Поликарп Поликарппович", 1, 50_000);
        employees[6] = new Employee("Кленов Валерий Афанасьевич", 2, 95_000);
        employees[7] = new Employee("Кулибин Леонид Дмитриевич", 3, 65_000);
        employees[8] = new Employee("Голубев Николай Абрамович", 5, 30_000);
        employees[9] = new Employee("Твардовский Михаил Борисович", 2, 95_000);

        for (int i = 0; i < employees.length; i++) {// выводит список сотрудников toString()
            System.out.println(employees[i]);
        }
        System.out.println("");
        System.out.println("Общая сумма зарплаты сотрудников за месяц - " + Employee.calculationSumSalaryInMonth(employees));
        System.out.println("");
        System.out.println("Средняя зарплата за месяц составила - " + Employee.middleMintSalaries(employees));
        System.out.println("");
        Employee.findEmployeeWithMaxSalary(employees); // реализуем метод нахождения сотрудника с самой высокой зп

        Employee.findEmployeeWithMinSalary(employees); // реализуем метод нахождения сотрудника с самой низкой зп
        System.out.println("");
        Employee.listNameEmployee(employees);
    }
}