import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Łukasz", 6300, 1, "2021-01-15", "Worker");
        Worker worker2 = new Worker("Albert", 5470, 2, "2021-02-20", "Worker");
        Worker worker3 = new Worker("Bożydar", 4398, 3, "2021-03-10", "Worker");
        Worker worker4 = new Worker("Gerwazy", 6000, 4, "2021-04-25", "Worker");
        Manager manager = new Manager("Ełgeniusz", 21370, 5, "2020-05-30", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("-" + employee.getName() + " (ID: " + employee.hashCode() + 
                               ", Position: " + employee.getPosition() + 
                               ", Hire date: " + employee.getHireDate() + 
                               ", Salary: " + employee.getSalary() + ")");
        }
    }
}