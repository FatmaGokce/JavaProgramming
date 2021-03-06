package office_hours.Practice_03_23_2021;
/*
Given three String variables of some text find and print the longest word
that also contains 'a'
    Ex:
        "java"
        "mouse"
        "computer"
        Output: java
    Ex:
        "java"
        "mouse"
        "apples"
        Output: apples

Challenge: Instead of just checking for 'a' add another variable
that can be used to check for any character.
 */
import java.util.Scanner;

public class BiggestWordWithA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three words: ");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();
        String biggestWordWithA = "";

        if (word1.contains("a") && word1.length() > biggestWordWithA.length()){
            biggestWordWithA = word1;
        }
        if (word2.contains("a") && word2.length() > biggestWordWithA.length()){
            biggestWordWithA = word2;
        }
        if (word3.contains("a") && word3.length() > biggestWordWithA.length()){
            biggestWordWithA = word3;
        }
        if (biggestWordWithA.isEmpty()) {
            System.out.println("No words contained A");
        } else {
            System.out.println("Longest word with A:" + biggestWordWithA);
        }
    }
}
