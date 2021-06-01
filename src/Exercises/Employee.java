package Exercises;

public class Employee {
    public static void main(String[] args) {
        String firstName = "James";
        String lastName = "Bond";
        String companyName = "Tesla";
        double salary = 100000;
        int startDay = 4;
        String startMonth = "January";
        int startYear = 2021;
        boolean areTheyFullTime = true;
        String jobTitle = "SDET";
        String officeAddress= "100 S LaneHampton, VSA 13312";

        String fullName = firstName +" "+ lastName;
        String fullStartDate = startMonth +" "+startDay +", "+ startYear;
        String email = firstName + startDay + "@" + companyName + ".com";
        double salaryAfterThreeYears = salary + (startDay * 1000);

        System.out.println("\t***** Tesla New Hire Information *****");
        System.out.println(firstName + " welcome to " + companyName);
        System.out.println("Your start day as a " + jobTitle + " will be on " + fullStartDate );
        System.out.println("You are fulltime : " + areTheyFullTime + " and will he making " + salary + " per year");
        System.out.println("The office is located at:\n" + officeAddress);
        System.out.println();
        System.out.println("\tOfficial information:");
        System.out.println("New hire name: " + fullName);
        System.out.println("Starts on: " + fullStartDate);
        System.out.println("Email generated: " + email);
        System.out.println("Your expected salary after 3 years: " + salaryAfterThreeYears);
    }
}
