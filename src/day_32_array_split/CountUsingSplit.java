package day_32_array_split;

import java.util.Arrays;

public class CountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cat tabby cat persian cat no cat here some other cat type";
        String[] catArray = cats.split("cat");

        System.out.println(Arrays.toString(catArray));
        System.out.println("number of cats = "+ (catArray.length-1));

        for (String type : catArray){
            System.out.println(type);
        }
        //second way with for loop
        /** int count = 0;
         for(int i = 0; i < cats.length() - 2; i++) {
         if(cats.substring(i, i +3).equals("cat")) {
         count++;
         }
         }
         System.out.println("count of cats = " + count);
         */

    }
}
