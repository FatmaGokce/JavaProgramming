package day_12_conditional_statements;

import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int number = scan.nextInt();

        if (number > 0) {
            System.out.println(number + " is positive");
        }
        else {
            System.out.println(number + " is negative");
        }

        int count = 25;

        if (count > 30) {
            System.out.println("Count is more than 30");
        }
        else {
            System.out.println("Count less than 30");
        }

        byte age = 17;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
            System.out.println("Because your are older than 18.");
        }
        else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
