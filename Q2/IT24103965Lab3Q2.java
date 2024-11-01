import java.util.Scanner;

public class IT24103965Lab3Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input monthly salary
        System.out.print("Enter monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        // Input number of OT hours
        System.out.print("Enter number of OT hours: ");
        int otHours = scanner.nextInt();

        // Input OT hourly rate
        System.out.print("Enter OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();

        // Calculate OT amount
        double otAmount = otHours * otHourlyRate;

        // Calculate total salary
        double totalSalary = monthlySalary + otAmount;

        // Display results
        System.out.println("OT Amount: " + otAmount);
        System.out.println("Total Salary: " + totalSalary);

        scanner.close();
    }
}
