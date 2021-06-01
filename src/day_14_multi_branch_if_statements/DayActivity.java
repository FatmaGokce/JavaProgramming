package day_14_multi_branch_if_statements;

import java.util.Scanner;

public class DayActivity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How is weather (sunny, rainy, snowy, windy) :");
        String weather = scan.next();

        if (weather.equals("sunny")) {
            System.out.println("Go to park, hiking, and code java.");
        }
        else if (weather.equals("rainy")) {
            System.out.println("Stay home, drink tea, and code java.");
        }
        else if (weather.equals("snowy")) {
            System.out.println("Clean the car then build snowman, drink hor chocolate, and code java");
        }
        else if (weather.equals("windy")) {
            System.out.println("Get ready for power loss, fly a kite, and code java.");
        }
        else {
            System.out.println("Just keep coding java.");
        }
    }
}
