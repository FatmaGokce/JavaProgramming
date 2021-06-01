package day_14_multi_branch_if_statements;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter two numbers :");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("Enter the operator (+, -, /, *)");
        char operator = scan.next().charAt(0);

        if (operator == '+') {
            System.out.println(num1 +" + " + num2 + " = " + (num1+num2));
        }
        else if (operator == '-') {
            System.out.println(num1 +" - " + num2 + " = " + (num1-num2));
        }
        else if (operator == '*') {
            System.out.println(num1 +" * " + num2 + " = " + (num1*num2));
        }
        else if (operator == '/') {
            if (num2 != 0) {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
            else {
                System.out.println(" 0 makes the function undefined.");
                System.out.println("Change the num2 please :");
                num2 = scan.nextDouble();
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }

        }
        else {
            System.out.println("Invalid operators... - " + operator);
        }
    }
}
