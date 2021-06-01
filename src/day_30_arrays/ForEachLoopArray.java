package day_30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};

        System.out.println("------- FOR EACH LOOP ------");
        for ( int eachNum : data ) {
            System.out.print(eachNum + " ");
        }
        System.out.println();
        //repeat above with for loop
        System.out.println("------- FOR LOOP -------");
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        //print last value in array using length - 1
        System.out.println(data[9]);//1. way
        System.out.println(data[data.length-1]);//2. way

        //loop array reverse
        System.out.println("-----LOOP ARRAY REVERSE-------");
        for (int i = data.length-1; i >= 0; i--){
            System.out.println(data[i]);
        }
    }
}
