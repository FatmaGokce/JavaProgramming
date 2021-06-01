package day_09_scanner_practice;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1. number: ");
        int fNumber = scan.nextInt();
        System.out.print("Enter 2. Number :");
        int sNumber = scan.nextInt();
        System.out.print("Result : " + (fNumber+sNumber));
    }
}
