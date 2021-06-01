package day_09_scanner_practice;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter price for milk: ");
        double pMilk = scan.nextDouble();
        System.out.print("Enter price for bread ; ");
        double pBread = scan.nextDouble();
        System.out.print("Enter price for cucumber : ");
        double pCucumber = scan.nextDouble();
        double totalPrice = pMilk + pBread + pCucumber;
        double tax = totalPrice * 0.13;
        System.out.println("Total Price is : " + totalPrice);
        System.out.println("Total Tax: " + tax);
        System.out.println("Total Price with Tax: " + (tax + totalPrice));
    }
}
