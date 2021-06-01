package day_21_string_manipulation2;

public class StringIndexOf {
    public static void main(String[] args) {
        /**            01234567            */
        String word = "selenium project";
        System.out.println(word.indexOf("n"));//4
        System.out.println(word.indexOf("e"));//1
        System.out.println(word.indexOf("um"));//6
        System.out.println(word.indexOf("java"));//-1
        System.out.println(word.indexOf("t"));//15

    }
}
