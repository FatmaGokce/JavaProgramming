package day_38_method;

public class ArrayUtils {

    public static void printArray(int[] nums){
        for (int n : nums){
            System.out.println(n + " ");
        }
        System.out.println();
    }

    public static int sum(int[] num){

        int sum = 0;
        for (int eachnum : num){
            sum += eachnum;
        }
        return sum;//test print/ test class
    }

    public static boolean contains(int[] nums, int num) {
        boolean found = false;
        for(int each : nums) {
            if(each == num) {
                found = true;
                break;
            }
        }
        return found;
    }
}
