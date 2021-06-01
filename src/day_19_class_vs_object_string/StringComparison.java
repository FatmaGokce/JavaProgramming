package day_19_class_vs_object_string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Cyprus";
        //equals() method - Case Sensitive
        System.out.println(city.equals("Cyprus")); //true
        System.out.println(city.equals("cyprus")); //false
        System.out.println(city.equals("CYPRUS")); //false

        //equalsIgnoreCase() method - case insensitive comparison
        System.out.println(city.equalsIgnoreCase("Cyprus"));//true
        System.out.println(city.equalsIgnoreCase("CYPRUS"));//true
        System.out.println(city.equalsIgnoreCase("cyprus2"));//false
        System.out.println(city.equalsIgnoreCase("CyPRuS"));//true

        if (city.equals("CyPRus")) {
            System.out.println("equals() - true");
        }else {
            System.out.println("equals() - flase");
        }

        if (city.equalsIgnoreCase("CYPRUS")) {
            System.out.println("equals.IgnoreCase() - true");
        } else {
            System.out.println("equals.IgnoreCase() - false");
        }
    }
}
