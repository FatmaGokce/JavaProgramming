package day_18_condotions_practice_strings_intro;

public class ScoreRangeChange {
    public static void main(String[] args) {
        int score = 91;

        if (score >= 1 && score <= 40) {
            System.out.println("D");
        }else if (score > 40 && score <= 60) {
            System.out.println("C");
        }else if (score > 60 && score <= 90) {
            System.out.println("B");
        }else if (score > 90 && score <= 100){
            System.out.println("A");
        }else {
            System.out.println("Invalid Score");
        }
    }
}
