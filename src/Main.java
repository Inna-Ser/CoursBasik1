import coursBasic1.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Иванов Иван Иванович", 1, 50_000);
        Employee employee1 = new Employee("Сидоров Андрей Петрович", 2, 85_350);
        Employee employee2 = new Employee("Козлов Сидор Сидорович", 3, 100_000);
        Employee employee3 = new Employee("Петров Виталий Васильевич", 4, 26_000);
        Employee employee4 = new Employee("Ромашка Анна Петровна", 5, 60_000);

        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);


    }
}