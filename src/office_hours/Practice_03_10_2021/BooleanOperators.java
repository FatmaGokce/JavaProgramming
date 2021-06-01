package office_hours.Practice_03_10_2021;
/*
Create a program that will accept a number and it will print
if it is evenly divisible by 2, 3, and 5.

Ex:
number = 65

Output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true
 */
import java.util.Scanner;

public class BooleanOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        boolean result = number % 2 == 0;
        boolean result1 = number % 3 == 0;
        boolean result2 = number % 5 == 0;

        if (result) {
            System.out.println(number + " is divisible by 2 : " + result);
        }
        else {
            System.out.println(number + " is divisible by 2 : " + result);
        }
        if (result1) {
            System.out.println(number + " is divisible by 3 : " + result1);
        }
        else {
            System.out.println(number + " is divisible by 3 : " + result1);
        }
        if (result2) {
            System.out.println(number + " is divisible by 5 : " + result2);
        }
        else {
            System.out.println(number + " is divisible by 5 : " + result2);
        }

    }
}
