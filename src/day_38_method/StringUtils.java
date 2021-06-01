package day_38_method;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(\"hello\") = " + isNullOrEmpty("hello"));
        String word = null;
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));

    }

    public static boolean isNullOrEmpty(String str) {
        //return (str == null || str.isEmpty());
        if (str == null || str.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindrome(String str) {
        //boolean isPalindrome = true;
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
            if (reverse.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public static String reverse(String str) {
            String reversed = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }
            return reversed;
        }
        //second way palindrome
    /*public static boolean isPalndrome(String str) {
        str = str.toLowerCase();
        for(int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }*/

}

