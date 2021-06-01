package day_15_logical_switch_ternary;

public class JobOfferSelectors {
    public static void main(String[] args) {
        String location = "ON";
        double salary = 120_000;
        boolean isRemote = true;
        boolean benefits = true;

        if (location.equals("ON") && isRemote && benefits && salary >= 120_000){
            System.out.println("Sure, I will accept this offer");
        } else {
            System.out.println("Keep looking for a job");
        }
    }
}
