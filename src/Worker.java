public class Worker {
    String name;
    double baseSalary;
    double complement;
    double totalSalary;
    
    public Worker(String n, double b, double c) {
        name = n;
        baseSalary = b;
        complement = c;
    }

    public double getTotalSalary() {
        totalSalary = baseSalary + complement;

        return totalSalary;
    }

}
