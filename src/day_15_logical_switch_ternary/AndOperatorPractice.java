package day_15_logical_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = false;
        String itemName = "Wooden Spoon";

        if(onSale && freeShipping) {
            System.out.println("Adding to cart -  " + itemName);
        }
        else {
            System.out.println("Continue shopping for good deals on- " + itemName);
        }

        if (onSale && freeShipping && itemName.equals("Wooden Spoon")) {
            System.out.println("Adding to cart - ");
        } else {
            System.out.println("Don't add this item");
        }
    }
}
