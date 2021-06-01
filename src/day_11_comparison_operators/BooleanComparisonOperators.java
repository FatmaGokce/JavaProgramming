package day_11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10 == 10);
        System.out.println("10 == 10");
        System.out.println(1000 > 100);
        System.out.println(985.44 < 98547.8);
        System.out.println(10 <= 10);
        System.out.println(5 >= 2);
        System.out.println(-100 != 44);

        boolean result = 5 == 5;
        System.out.println("result = " + result);

        result = 33 > 44;
        System.out.println("result = " + result);

        result = 88 < 99;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city == "Baku");

        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName);
        checkName = name !="Kuzzat";
        System.out.println("checkName = " + checkName);
    }
}
