package office_hours.Practice_03_10_2021;

import java.util.Scanner;
/*
[If statement, operators]

Write a java program that can identify if a person is eligible to vote
for the president. Age of voting: 18. Print "Eligible to vote" or
"not eligible to vote".

    => To make it dynamic change the three angles to be Scanner inputs
 */
public class IfOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        boolean voteAge = age >= 18;

        if(voteAge) {
            System.out.println("Eligible to Vote");
        }
        else {
            System.out.println("Not Eligible to Vote");
        }
    }
}
