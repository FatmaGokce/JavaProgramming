package day_10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = " + i);

        // type 4 different ways of decreasing by 1
        int j = 20;
        j = j - 1;
        j -= 1;
        j--;
        --j;
        System.out.println("j = " + j);

    }
}
