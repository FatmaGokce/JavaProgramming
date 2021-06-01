package day_19_class_vs_object_string;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "Cybertek";
        String sentence = "123 Java IS fun";

        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("java".toUpperCase());
        System.out.println(sentence.toLowerCase());

        word.toLowerCase();// it is not work.
        System.out.println(word);// same output Cybertek

        word = word.toLowerCase();
        System.out.println(word);// it worked

        String company = "Amazon";
        System.out.println("Company is upperCase - " + company.toUpperCase());

        //change variable company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);

    }
}
