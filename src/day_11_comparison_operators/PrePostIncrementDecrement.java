package day_11_comparison_operators;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int num3 = 10;
        int num4 = num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples);//6
        System.out.println("basket = " + basket);//6

        int cars = 5;
        System.out.println(cars++);//5
        System.out.println(++cars);//7

        int sedans = 10;
        System.out.println(sedans++);//10 but after assigns sedans = 11
        System.out.println(sedans);//11

        int a = 50;
        int b = 22;
        int c = a++ + ++b + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int i = 5;
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);

    }
}
