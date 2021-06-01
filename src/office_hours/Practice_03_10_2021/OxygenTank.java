package office_hours.Practice_03_10_2021;

import java.util.Scanner;

/*
You are diving in the ocean. Your oxygen tank has a certain level (number)
and you must print a message based on the level
x
> Above 90 - Your tank is full
> Above 80 - Still okay
> Above 70 - Don't go too far
> Above 60 - Start to head back
> Above 50 - Be careful now you at at 50%
 */
public class OxygenTank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your oxygen tank level : ");
        double level = in.nextDouble();

        if (level > 90) {
            System.out.println("Your tank is full");
        }
        else if (level > 80) {
            System.out.println("Still okay");
        }
        else if (level >70 ) {
            System.out.println("Don't go too far");
        }
        else if (level >60 ) {
            System.out.println("Start to head back");
        }
        else if (level >50) {
            System.out.println("Be careful now you at at 50%");
        }
        else {
            System.out.println("Go back!!!!");
        }
    }
}
