package day_16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        double price = 0.0;
        int calories = 0;
        String size ="grande";

        switch (size) {
            case "tall":
                System.out.println("Cappuccino Tall size please");
                price = 3.69;
                calories = 90;
                System.out.println("Total price: " + price);
                System.out.println("You will consume " + calories + " cal of energy");
                break;
            case "grande":
                System.out.println("Grande Cappuccino Please");
                price = 3.99;
                calories = 120;
                System.out.println("Total price: " + price);
                System.out.println("You will consume " + calories + " cal of energy");
                break;
            case "venti":
                System.out.println("Venti Cappuccino please");
                price = 4.29;
                calories = 150;
                System.out.println("Total price: " + price);
                System.out.println("You will consume " + calories + " cal of energy");
                break;
            default:
                System.out.println("We don't serve that "+ size +"size of Cappuccino");
        }
    }
}
