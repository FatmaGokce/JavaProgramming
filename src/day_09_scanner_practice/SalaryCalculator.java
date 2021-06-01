package day_09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Hourly Rate : $");
        double hourlyRate = scan.nextDouble();
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52/12;
        double annualPay = monthlyPay * 12;

        System.out.println("Weekly Pay : $" + weeklyPay);
        System.out.println("Monthly Pay : $" + monthlyPay);
        System.out.println("Annual Pay : $" + annualPay);
    }
}
