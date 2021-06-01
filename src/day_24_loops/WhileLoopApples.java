package day_24_loops;

public class WhileLoopApples {
    public static void main(String[] args) {
        int apples = 1;

        while (apples <= 10) {
            System.out.println("Eating an apple "+ apples);
            apples++;//++apples; same result
        }
        System.out.println("No more apples");
    }
}
