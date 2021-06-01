package day_45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();

        System.out.println("coffee amount = "+myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink = " + myCoffee.getAmount());
        System.out.println("type = "+myCoffee.getType());
        myCoffee.setType("Turkish Coffee");
        System.out.println("after set type = " + myCoffee.getType());
        //describe myCoffee - show all variable values
        System.out.println(myCoffee.toString());

        //add another coffee object, set values, call methods
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = "+ coffee1.getType());

        Coffee coffee2 = coffee1;// coffee2 = cappuccino, coffee1 = cappuccino
        System.out.println("coffee2 type = " + coffee2.getType());
        coffee2.setType("espresso");//coffee2 = espresso, coffee1 = espresso
        System.out.println("coffee1 =" + coffee1.getType());
        Coffee coffee3 = new Coffee();
        coffee3.setType("frappucino");//coffee3 = frappucino
        System.out.println("coffee3 = " + coffee3.getType());
        coffee3 = coffee2;//coffee3 = frappucino, coffee2 = frappucino, coffee1 = frappucino
        System.out.println("coffee3 = "+coffee3.getType());
        System.out.println("coffee1 = " + coffee1.getType());

        Coffee coffee4 = null;//referance variable does not refer/point to any Object in HEAP
        coffee4.setType("turkish");//NullPointerException

    }
}
