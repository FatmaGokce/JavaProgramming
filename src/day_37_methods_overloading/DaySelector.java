package day_37_methods_overloading;
/*
add new class DaySelector
add new method: getDayName
input : int day
return : String

1 - "Monday"
2 - "Tuesday"
...
7 - "Sunday"
any other:
    print "invalid day"
        return empty

getDayName(1); => "Monday"
getDayName(5); => "Friday"
getDayName(10); => print "Invalid day" -> ""
 */
public class DaySelector {
    public static void main(String[] args) {
        getDayName(1);//doesn't show in console when it execute
        System.out.println(getDayName(1));
        System.out.println(getDayName(7));
        System.out.println(getDayName(9));
        getDayName(9);

        for (int i = 1; i <= 8; i++) {
            System.out.println(i + " = "+getDayName(i));

        }
        //store getDayName into variable, and print variable
        String dayName = getDayName(5);
        System.out.println("Today is " + dayName);
        String someDay = getDayName(0);
        if (someDay == null) {
            System.out.println("someday is null for invalid day");
        }

        System.out.println("Day is "+getDayNameV2(2));
    }

    public static String getDayName(int day){
        switch (day) {
            case 1:
                return "Monday";//exit method
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                System.out.println("ERROR: invalid day - " + day);
                return null;//nothing, no object
        }

    }

    public static String getDayNameV2(int day){
        String dayName;
        switch(day) {
            case 1: dayName = "Monday"; break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid day - " + day);
                dayName = null;
        }
        return dayName;
    }
}
