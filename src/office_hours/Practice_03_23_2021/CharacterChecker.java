package office_hours.Practice_03_23_2021;

import java.util.Scanner;

public class CharacterChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the letter");
        char letter = input.next().charAt(0);

        if(letter >= 'A' && letter <= 90) {// if(letter >= 65 && letter <= 90) same thing
            System.out.println(letter + " is uppercase");
        }else if (letter >= 'a' && letter <= 'z') {
            System.out.println(letter + " is a lower letter");
        }else {
            System.out.println(letter + " is not valid character");
        }
    }
}
