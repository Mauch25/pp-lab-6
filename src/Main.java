import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Łukasz", 6300, 1);
        Worker worker2 = new Worker("Albert", 5470, 2);
        Worker worker3 = new Worker("Bożydar", 4398, 3);
        Worker worker4 = new Worker("Gerwazy", 6000, 4);
        Manager manager = new Manager("Ełgeniusz", 21370, 5);

        Worker[] workers = {worker1, worker2, worker3, worker4};

        for (Worker worker : workers) {
            System.out.println(worker.getName() + "'s salary: " + worker.getSalary());
            worker.work();
        }

        System.out.println(manager.getName() + "'s salary: " + manager.getSalary());
        manager.work();
    }
}
