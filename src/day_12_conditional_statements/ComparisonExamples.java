package day_12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;// it means 4_5
        int speedLimit = 55;
        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < currentSpeed);
        System.out.println(currentSpeed == speedLimit);

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);

        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);

        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("Can I afford ?- " + (accountBalance >= itemPrice));
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can I afford? - " + canAfford);

        //decrease balance by itemPrice. using shorthand operator.
        accountBalance -= itemPrice;
        boolean isBroke = accountBalance <= 0;

        System.out.println("Am I broke? - " + isBroke);

    }
}
