package day_09_scanner_practice;

import java.util.Scanner;

public class TemperatureOfCelsius {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("*************  F to C CONVERTER PROGRAM ***************");
        System.out.print("Enter Fahrenheit temperature: ");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit-32) * 5/9;
        System.out.println(fahrenheit + " F is " + celsius + " C");
    }
}
