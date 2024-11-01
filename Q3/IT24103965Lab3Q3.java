import java.util.Scanner;

public class IT24103965Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();
        
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] counts = new int[denominations.length];

        int remainingAmount = amount;
        
        // Calculate the number of each denomination
        for (int i = 0; i < denominations.length; i++) {
            counts[i] = remainingAmount / denominations[i];
            remainingAmount %= denominations[i];
        }
        
        // Print the result
        System.out.println("Amount = " + amount);
        for (int i = 0; i < denominations.length; i++) {
            System.out.printf("%d Notes – %d%n", denominations[i], counts[i]);
        }
        
        scanner.close();
    }
}
