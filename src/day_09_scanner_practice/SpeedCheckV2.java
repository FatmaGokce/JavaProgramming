package day_09_scanner_practice;
import java.util.Scanner;

public class SpeedCheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int speedLimit = 55;
        System.out.print("Enter the current speed : ");
        int currentSpeed = scan.nextInt();
        int overTheLimit = currentSpeed-speedLimit;
        System.out.println("You ar driving " + overTheLimit + " mph over the limit. Slow Down!");
    }
}
