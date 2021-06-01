package day_36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
        fullName();

        System.out.println("Full Name = " + fullName());
        System.out.println("isMarried " + isMarried());
        System.out.println("Age = " + getAge());
        System.out.println("Birth Year = " + getRandomYear());//dynamic.

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();
        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

        if (isMarried()){
            System.out.println("Married");
        }else {
            System.out.println("Single");
        }

    }
    public static String fullName(){
        //System.out.println("inside fullName method");
        return "Mike Smith";
    }

    public static boolean isMarried() {
        return false;
    }
    public static int getAge(){
        return 35;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }

}
