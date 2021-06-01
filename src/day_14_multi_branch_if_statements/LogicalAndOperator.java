package day_14_multi_branch_if_statements;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println();
        System.out.println(10 > 5 && 1 == 1);
        System.out.println(99 < 100 && 22 > 25);
        System.out.println(65 < 45 && 17 < 25);
        System.out.println(23 < 12 && 75 > 100);
        System.out.println();
        int apples = 10, oranges = 5;
        boolean check = apples > 5 && oranges > 3;

        System.out.println("check = " + check);

        if (apples > 6 && oranges > 2) {
            System.out.println("I have enough apples and oranges");
        }
        else {
            System.out.println("I need to go Walmart to buy some fruit.");
        }
    }
}
