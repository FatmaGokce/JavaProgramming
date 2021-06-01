package day_23_string_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den sp oon";

        System.out.println(word.toUpperCase().toLowerCase().length());//12
        System.out.println(word.replace(" ","").toUpperCase());

        String city = "iSTanbUl";
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());


    }

}
