package day_12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'H';
        System.out.println("A > H - " + (letter1 > letter2));
        System.out.println("A < H - " + (letter1 < letter2));
        System.out.println("A == H - " + (letter1 == letter2));
        System.out.println("A != H - " + (letter1 != letter2));

        char grade = 'A';
        boolean pass = grade < 'E';
        System.out.println("Did you pass the exam? - " + pass);
    }
}
