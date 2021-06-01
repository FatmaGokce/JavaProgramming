package day_17_ternary_nested_conditions;

public class WendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drinkItem = "coke";
        String snackItem = "chips";

        if (selection.equals("drink")) {
            System.out.println("Drink option is selected");
            if (drinkItem.equals("tea")) {
                System.out.println("tea is selected");
            }else{
                System.out.println("coke is selected");
            }
        }else if (selection.equals("snack")) {
            System.out.println("snack option is selected");
            if (snackItem.equals("chips")) {
                System.out.println("chips option is selected");
            } else {
                System.out.println("candy option is selected");
            }
        }
    }
}
