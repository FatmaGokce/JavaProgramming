package day_13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Canada";

        if (city.equals("Canada")){
            System.out.println("My city is " + city);
        }
        else {
            System.out.println("It si not my city");
        }

        String weather = "sunny";
        if (weather == "sunny") {//if(weather.equals("sunny"))
            System.out.println("Lets go out");
        }
        else {
            System.out.println("Lets stay indoors");
        }
    }
}
