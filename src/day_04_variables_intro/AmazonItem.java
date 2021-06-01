package day_04_variables_intro;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class AmazonItem {
    public static void main(String[] args) {
        String description = "HIC wooden spoon";
        int ratingsCount = 181;
        double price = 5.99;
        String seller = "amazon.com";
        boolean prime = true;
        //String prime = "yes";

        System.out.println("--- PRODUCT INFORMATION ---");
        System.out.println(description);
        System.out.println("* * * * * ");
        System.out.println(ratingsCount);
        System.out.println(price);
        System.out.println(seller);
        System.out.println(prime);
    }
}
