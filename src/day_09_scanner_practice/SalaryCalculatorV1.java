package day_09_scanner_practice;

public class SalaryCalculatorV1 {
    public static void main(String[] args) {
        System.out.print("Enter hourly rate : ");
        double hourlyRate = 50.0;
        System.out.println(hourlyRate);
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52/12;
        double annualPay = monthlyPay * 12;

        System.out.println("Weekly Pay : $" + weeklyPay);
        System.out.println("Monthly Pay : $" + monthlyPay);
        System.out.println("Annual Pay : $" + annualPay);
    }
}
