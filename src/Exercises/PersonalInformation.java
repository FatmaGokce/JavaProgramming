package Exercises;

import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many people they live with?");
        int numberPeople = scan.nextInt();

        if (numberPeople <= 2) {
            System.out.println("Live with less than 2 people");
        }else if (numberPeople >= 3 && numberPeople <= 6) {
            System.out.println("Live with 3 - 6 people");
        }else {
            System.out.println("Live with more than 6 people");
        }

        System.out.println("What city they live in?");
        String city = scan.next();
        System.out.println("Are you live in Downtown? (yes or no)");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Have you thought about moving to the suburbs?");
            String ans = scan.next();
            if (ans.equalsIgnoreCase("yes")) {
                System.out.println("do it its great");
            } else {
                System.out.println("You should think about it");
            }
        }
        System.out.println("What is your favorite animal?");
        String animal = scan.next();
        System.out.println("Wow " + animal + " is great animal.");

        System.out.println("How many pets they want?");
        int count = scan.nextInt();
        System.out.println("Interesting, do you want " + count + " " + animal);
        }

    }
