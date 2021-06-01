package office_hours.Practice_05_10_2021;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 "ABCD123$%#@&456EFG"
 list1: {$, %, #, @, &};
 list2: {A, B, C, D, E, F, G}
 LIST3: {1, 2, 3, 4, 5, 6}
 */
public class SeparateParts {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG";
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            if (Character.isLetter(eachChar)){
                letters.add(eachChar);
            }else if(Character.isDigit(eachChar)){
                digits.add(eachChar);
            }else {
                special.add(eachChar);
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(special);
    }
    public static ArrayList<ArrayList<Character>> separateParts(String str) {

        ArrayList<ArrayList<Character>> all = new ArrayList<>(); // [ [letters ], [ digits ], [special]]

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();
        all.add(letters);
        all.add(digits);
        all.add(special);

//        all.add(new ArrayList<>());
//        all.add(new ArrayList<>());
//        all.add(new ArrayList<>());

        for(int i =0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            if(Character.isLetter(eachChar)){
                all.get(0).add(eachChar);
            } else if(Character.isDigit(eachChar)){
                all.get(1).add(eachChar);
            } else {
                all.get(2).add(eachChar);
            }

        }

        return all;
    }
}
