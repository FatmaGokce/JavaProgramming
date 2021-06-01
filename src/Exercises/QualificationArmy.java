package Exercises;

public class QualificationArmy {
    public static void main(String[] args) {
        String citizenship = "USA";
        boolean resident = false;
        boolean hasHighDiploma = true;
        int age = 38;

        if (!(citizenship.equalsIgnoreCase("usa") || resident)){
            System.out.println("You must be a U.S citizen or resident");
        }
        else if (!(age >= 18 && age <=35)){
            System.out.println("Your age must be between 18 to 35 years old");
        }
        else if(!(hasHighDiploma)){
            System.out.println("You must have a high school diploma");
        }
        else {
            System.out.println("You are qualified for the US Army");
        }


    }
}
