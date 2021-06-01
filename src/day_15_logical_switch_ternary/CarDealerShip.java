package day_15_logical_switch_ternary;

public class CarDealerShip {
    public static void main(String[] args) {
        double budget = 5000;
        String model = "Tesla";
        double carPrice = 7500;

        if (carPrice <= budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))) {
            System.out.println("Ready to purchase model = " + model + ", price = " + carPrice);
        } else {
            System.out.println("Not interested in model = " + model + ", price = " + carPrice);
        }
    }
}
