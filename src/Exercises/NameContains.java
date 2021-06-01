package Exercises;

import java.util.Scanner;

public class NameContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fullName = "fatma gokce";
        System.out.println("Enter the last name: ");
        String lastName = scan.nextLine();

        if (fullName.contains(" " + lastName)) {
            System.out.println("Same last name");
        }else {
            System.out.println("Not the same last name");
        }
    }
}
