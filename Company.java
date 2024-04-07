import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Michael Jackson", 60000, 0);
        employees[1] = new Worker("Harry Potter", 60000, "Software Developer");
        employees[2] = new Employee("Adam Ken", 71000);
        employees[3] = new Worker("Maria Smith", 32000, "Ksiegowa");
        employees[4] = new Worker("Santa White", 32000, "Ksiegowy");

        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}