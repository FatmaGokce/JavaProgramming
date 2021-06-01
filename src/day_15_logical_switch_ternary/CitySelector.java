package day_15_logical_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";

        if (city.equals("Cyprus") || city.equals("Moscow")) {
            System.out.println("Willing to relocate to " + city);
        }
        else {
            System.out.println("Not considering Seattle in " + city);
        }

        String teacher = "Saim";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is a java class with " + teacher);
        } else {
            System.out.println("Soft skill class with Nadir.");
        }

        //company - "Google" OR salary >= 100k -> accept offer
        String company = "NadirTech";
        double salary = 105_000.0;

        if(company.equals("Google") || salary >= 100_000) {
            System.out.println("Accepting offer from " +company);
        }else {
            System.out.println("Rejecting offer from " + company);
        }

        if(company.equals("Google") && salary >= 100_000) {
            System.out.println("Accepting offer from " +company);
        }else {
            System.out.println("Rejecting offer from " + company);
        }
    }
}
