package office_hours.Practice_03_10_2021;

import java.util.Scanner;

/*
Write a program that will accept your salary amount.
Then also ask the user if they are full time or not (boolean).
If they are fulltime add 20000 to their salary, but if they are part time
then subtract 5000. Print the final salary.
 */
public class SalaryBoolean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you fulltime? -> (true or false)");
        boolean fulltime = scan.nextBoolean();
        double salary = 12000;

        if (fulltime) {
            salary += 20000;
            System.out.println("Your new salary is : " + salary);
        }
        else {
            salary -= 5000;
            System.out.println("Your new salary is : " + salary);
        }
    }
}
