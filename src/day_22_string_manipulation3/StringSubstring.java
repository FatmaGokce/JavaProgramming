package day_22_string_manipulation3;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";

        System.out.println(word.substring(1));//ava is fun
        System.out.println(word.substring(0,7));//
        //System.out.println(word.substring(-2)); error
        System.out.println(word.substring(10));//n
        System.out.println(word.substring(0,4));
        System.out.println(word.substring(5,7));
        System.out.println(word.substring(5));
        System.out.println(word.substring(11));//""(empty space)
    }
}
