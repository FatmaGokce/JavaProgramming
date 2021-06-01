package day_24_loops;

import java.util.Scanner;

public class CountUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number to count until: ");
        int numToStop = scan.nextInt();
        int start = 1;
        while (start <= numToStop) {
            System.out.print(start + " ");
            start++;
        }
    }
}
