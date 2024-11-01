import java.util.Scanner;

public class IT24103965Lab3Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // price of 1 kg of rice
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = input.nextDouble();

        //  number of kilograms to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();

        // Calculate the total amount to pay
        double totalAmount = pricePerKg * kilograms;

        // Display the total amount
        System.out.printf("The total amount to pay is: %.2f\n", totalAmount);

        // Close the scanner
       Scanner close;

    }
}
