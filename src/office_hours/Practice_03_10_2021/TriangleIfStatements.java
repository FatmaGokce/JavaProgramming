package office_hours.Practice_03_10_2021;

import java.util.Scanner;

/*
[Triangle - If statement, operators]

A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and
check whether the triangle is valid or not. Print "Valid triangle" or
"Not a valid triangle".

    => To make it dynamic change the three angles to be Scanner inputs
 */
public class TriangleIfStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 3 triangle angles : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int sum = (a + b + c);
        System.out.println("Total of the angles is : " + sum);

        if(sum == 180) {
            System.out.println("Valid Triangle");
         }
        else {
            System.out.println("Not a Valid Triangle");
        }
    }
}
