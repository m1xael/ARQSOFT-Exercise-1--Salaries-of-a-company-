import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the Amount of Workers you want to create ...");

        Scanner scan = new Scanner(System.in);
        int listSize = scan.nextInt();
        scan.close();

        createWorkerList(listSize);
    }

    public static void createWorkerList(int listSize) {
        Worker [] workers = new Worker[listSize];

        for (int i = 0; i < listSize; i++) {
            int workerIndex = i + 1;
            String n = "Worker" + " " + workerIndex ;

            double b = Math.floor((Math.random() * 9 + 1) * 1000);
            double c = Math.floor((Math.random() * 9 + 1) * 1000);

            workers [i] = new Worker(n, b, c);

            System.out.println(workers[i].name + " Base Salary: " + workers[i].baseSalary + " Complement: " + workers[i].complement + " Total Salary: " + workers[i].getTotalSalary());
        }
    }

}