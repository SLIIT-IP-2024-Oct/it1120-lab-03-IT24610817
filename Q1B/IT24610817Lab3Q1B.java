import java.util.Scanner;

public class IT24610817Lab3Q1B{
    public static void main (String[]args){
        double pricePerKg, quantity;

        Scanner input = new Scanner(System.in);
              System.out.print("Enter the price of 1kg of rice: ");
        pricePerKg = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        quantity = input.nextDouble();

        double totalAmount = pricePerKg * quantity;

        double discount = totalAmount * 0.1; 
        totalAmount -= discount;

        System.out.println();
        System.out.println("The total amount with 10% discount is: " + totalAmount);
    }
}
    


