package array_practice_1;

import java.util.Scanner;

public class AverageNumFromArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++){
            num[i] = scan.nextInt();
        }
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
            sum += num[i];
        }
        System.out.println("] -> Average : "+ sum/size);
    }
}
