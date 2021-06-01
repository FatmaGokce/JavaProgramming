package day_36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(699);
        checkEligible(760);
        //System.out.println(checkEligible(700)); error- cannot print void method
        System.out.println(getCreditScore());
        System.out.println("CreditScore = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("Score = " + getCreditScore());

    }

    public static void checkEligible(int score){
        if (score >= 700) {
            System.out.println("You are eligible for leasing this car");
        }else {
            System.out.println("Sorry, you are not eligible for leasing this car");
        }
    }
    public static int getCreditScore() {
        return 800;
    }
}
