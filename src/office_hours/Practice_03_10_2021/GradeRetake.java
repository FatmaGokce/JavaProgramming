package office_hours.Practice_03_10_2021;

import java.util.Scanner;

/*
Write a program that will give the grade after the retake.
The program should read a score of the test and which attempt it was.

    If its the first attempt -> subtract 10%
    If its the second attempt -> subtract 20%
    If its the third attempt -> subtract 35%
 */
public class GradeRetake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        double grade = in.nextDouble();
        System.out.println("Enter your attempt : ");
        byte attempt = in.nextByte();

        if (attempt == 1) {
            grade *= 0.90;
            System.out.println("Your final grade is : " + grade);
        }
        else if (attempt == 2) {
            grade *= 0.80;
            System.out.println("Your final grade is : " + grade);
        }
        else if (attempt == 3) {
            grade *= 0.65;
            System.out.println("Your final grade is : " + grade);
        }
        else {
            System.out.println("You enter the invalid attempt. Please try again!");
        }
    }
}
