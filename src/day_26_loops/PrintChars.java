package day_26_loops;

import java.util.Locale;

public class PrintChars {
    public static void main(String[] args) {
        String word = "application";

        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
        }
        System.out.println("");
        for (int j = word.length()-1; j >= 0 ; j--) {
            System.out.print(word.charAt(j));
        }
    }
}
