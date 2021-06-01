package day_10_shorthand_operators;

import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How is the weather today?");
        String wToday = scan.next();
        System.out.println(wToday + " - is a nice day today!");
    }
}
