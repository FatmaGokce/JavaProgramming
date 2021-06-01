package day_20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));

        //if company contains space, print "multiple words company name"
        //else "single word company name"

        if(company.contains(" ")) {
            System.out.println("Multiple words company name");
        }else {
            System.out.println("Single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        if (etsyTitle.contains(" | ")){
            System.out.println("Pass - title check passed");
        }else {
            System.out.println("Fail - title check failed");
        }

        String firstName = "ahmed";
        if (firstName.contains("a") && firstName.contains("e")) {
            System.out.println("both a && e are present");
        }else {
            System.out.println("a || e not present");
        }

        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a or i is present");
        }else {
            System.out.println("a or i not present");
        }

        String email = "fozkalpli@gmail.com";
        if(email.contains("@") && email.contains(".com")) {
            System.out.println("Valid email address");
        }else {
            System.out.println("Invalid email address");
        }
        System.out.println("java".contains(" "));//false

        if (email.toLowerCase().contains("p")) {//first make everything lower case then checks contains("p")
            System.out.println("d is present");
        }else {
            System.out.println("d is not present");
        }
    }
}
