package array_practice_1;

import java.util.Scanner;

public class EvenAndOddFromArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] number = new int[size];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < size; i++){
            number[i] = scan.nextInt();
        }
        for ( int evenNumber : number ){
            if (evenNumber % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
