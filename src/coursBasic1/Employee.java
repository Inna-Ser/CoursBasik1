package coursBasic1;

import java.time.LocalDate;

public class Employee {
    private String nameEmployee;
    private int salary;
    private int department;
    private static int id = 1;

    public Employee(String nameEmployee, int department, int salary) {
        Employee.id++;
        this.nameEmployee = nameEmployee;
        this.department = department;
        this.salary = salary;
    }
    public static int getNumOfInstances() {
        return id;
        }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) { // мы знаем, что существуют только отделы 1, 2, 3, 4, 5.
        if (department >= 1 && department < 6) {
            this.department = department;
        } else {
            System.out.println("Ошибка! Такого отдела не существует");
        }
    }

    public void setSalary(int salary) {  // исключим возожность начислить минусовую зп
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Ошибка! Зарплата не может быть меньше 0");
            }
        }
    @Override
    public String toString () {
        return "Сотрудник " + nameEmployee + " из отдела " + department + " получает зарплату - " + salary + "р.";
    }

    public static void main(String args[]) {

    }
}
