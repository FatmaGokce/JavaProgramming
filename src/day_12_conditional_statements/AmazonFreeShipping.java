package day_12_conditional_statements;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total price: ");
        double totalPrice = scan.nextDouble();

        if (totalPrice >= 25) {
            System.out.println(" FREE SHIPPING ELIGIBLE. Your order total is $" + totalPrice);
        }
        else {
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $" + totalPrice + " less than minimum of $25");
        }
        System.out.println("Thanks for Shopping Amazon.");

    }
}
