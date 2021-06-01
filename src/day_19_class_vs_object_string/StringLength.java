package day_19_class_vs_object_string;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.length());//4
        System.out.println("wooden spoon".length());//12
        String firstName = "Fatma";
        System.out.println("firstName = " + firstName.length());
        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "abc123";

        if(password.length() >= 6 ) {
            System.out.println("Valid Amazon password");
        }else {
            System.out.println("Password too short");
        }
    }
}
