package office_hours.Practice_03_23_2021;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 10;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        boolean hourlyRateIsValid = hourlyRate > 0;
        boolean weeklyHoursAreValid = weeklyHours > 0 && weeklyHours <= 65;
        boolean numberOfWeeksAreValid = numberOfWeeks > 0 && numberOfWeeks <= 52;

        if (hourlyRateIsValid) {

            if (weeklyHoursAreValid) {

                if (numberOfWeeksAreValid) {

                    System.out.println("Salary is: " + (hourlyRate * weeklyHours * numberOfWeeks));

                } else {
                    System.out.println("Number of weeks cannot be less than 1 or greater than 52");
                }

            } else {
                System.out.println("Weekly hours cannot be zero, negative or more than 65");
            }

        } else {
            System.out.println("Hourly Rate cannot be Negative or Zero");
        }


        // Option 2

        if (hourlyRateIsValid && weeklyHoursAreValid && numberOfWeeksAreValid) {
            System.out.println("Salary is: " + (hourlyRate * weeklyHours * numberOfWeeks));
        } else {

            if (!hourlyRateIsValid) {
                System.out.println("Hourly Rate cannot be Negative or Zero");
            } else if (!weeklyHoursAreValid) {
                System.out.println("Weekly hours cannot be zero, negative or more than 65");
            } else {
                System.out.println("Number of weeks cannot be less than 1 or greater than 52");
            }
        }
    }
}
