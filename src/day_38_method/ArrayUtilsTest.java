package day_38_method;

import java.util.Arrays;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] number = {1, 3, 543, 89};
        ArrayUtils.printArray(number);
        //second way
        ArrayUtils.printArray(new int[] {1,25,63,458,98,234});

        System.out.println("sum = "+ArrayUtils.sum(number));
        System.out.println("sum = "+ArrayUtils.sum(new int[] {1,25,63,458,98}));

        System.out.println("num is among nums = "+ArrayUtils.contains(number, 89));

    }
}
