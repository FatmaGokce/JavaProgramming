package office_hours.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

/**
 Count Letters (Similar to Target word, but different layer)
 Given an ArrayList of Strings and a letter (char)
 print how many times the letter is found in the ArrayList elements
 Ex:
 Input:
        ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
 letter: ‘a’
 Output:  6
 */
public class countLetters {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java",
                "html", "css", "java", "javascript", "selenium"));
        char letter = 'a';
        int count = 0;

        for (String each : words){

            for (int i = 0; i < each.length(); i++) {
                if (each.charAt(i) == letter){
                    count++;
                }
            }
        }
        System.out.println(letter + " was found "+ count + " times");

    }
}
