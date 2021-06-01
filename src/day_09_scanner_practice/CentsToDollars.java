package day_09_scanner_practice;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many cents : ");
        int cents = scan.nextInt();
        int dollar = cents / 100;
        int remainingCents = cents % 100;
        System.out.println("In "+ cents + " cents is $" + dollar + "\nRemaining Cents: " + remainingCents + " cents");
    }
}
