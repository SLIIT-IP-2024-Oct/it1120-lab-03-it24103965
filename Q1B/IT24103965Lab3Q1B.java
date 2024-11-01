import java.util.Scanner;

public class IT24103965Lab3Q1B{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //  price of 1 kg of rice
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = input.nextDouble();
        
        //  number of kilograms to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();
        
        // Calculate the total amount
        double totalAmount = pricePerKg * kilograms;
        
        // Calculate the discount
        double discount = totalAmount * 0.10; // 10% discount
        double amountAfterDiscount = totalAmount - discount;
        
        // Display the total amount and the amount after discount
        System.out.printf("Total amount before discount: %.2f\n", totalAmount);
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("The total amount you have to pay after discount is: %.2f\n", amountAfterDiscount);
        
        // Close the scanner
        Scanner close;
    }
}
