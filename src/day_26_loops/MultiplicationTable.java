package day_26_loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();

        if(number < 1 || number > 10){
            System.out.println("ERROR: Invalid Input");
            return;//exit main method/ stop the program
        }

        for(int i = 1; i <= 10; i++) {
            System.out.println(number +" X "+ i + " = " + number*i);
        }
    }
}
