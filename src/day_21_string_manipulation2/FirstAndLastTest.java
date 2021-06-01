package day_21_string_manipulation2;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char second = word.charAt(2);
        if(first == second) {
            System.out.println("First and last letters match");
        }else {
            System.out.println("First and last letters mismatch");
        }

        String friend = "level";
        char firstLetter = friend.charAt(0);
        char lastLetter = friend.charAt(friend.length() - 1);
        System.out.println("firstLetter = " + firstLetter);
        System.out.println("lastLetter = " + lastLetter);
        if(firstLetter == lastLetter) {
            System.out.println(friend + "- first and last match");
        }else {
            System.out.println(friend + "- first and last mismatch");
        }
    }
}
