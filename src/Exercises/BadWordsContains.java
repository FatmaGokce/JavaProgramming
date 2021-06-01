package Exercises;

import java.util.Scanner;

public class BadWordsContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String message = scan.nextLine();

        if(message.contains("idiot") || message.contains("dumb") || message.contains("heck")) {
            System.out.println("Message not sent");
        } else {
            System.out.println("Message sent");
        }

    }
}
