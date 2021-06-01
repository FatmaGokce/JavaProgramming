package day_10_shorthand_operators;

import java.util.Scanner;

public class ChangeVariableValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 3;
        System.out.println("count = " + count);//soutv shortcut
        count += 2;//(count = count + 2)
        System.out.println("count = " + count);

        int apples = 5;
        System.out.println("apples = " + apples);
        apples +=10;
        System.out.println("apples = " + apples);

        int cents = 568;
        System.out.println("cents = " + cents);
        //keep whole dollars portion and just assign remaining cents
        cents = cents % 100;
        System.out.println("cents = " + cents);
    }
}
