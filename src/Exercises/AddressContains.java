package Exercises;

import java.util.Scanner;

public class AddressContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the address: ");
        String address = scan.nextLine();

        if (address.isEmpty()) {
            System.out.println("No address found");
        }

        System.out.println(address.toUpperCase());
    }
}
