package day_14_multi_branch_if_statements;

import java.util.Scanner;

public class CalculatorV1 {
    public static void main(String[] args) {
        double num1 = 12.7;
        double num2 = 5;
        char operator ='+';

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
            System.out.println(num1 +" / " + num2 + " = " + (num1/num2));
        }
        else {
            System.out.println("Invalid operators... - " + operator);
        }

    }
}
