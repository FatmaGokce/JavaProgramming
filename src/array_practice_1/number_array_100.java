package array_practice_1;

public class number_array_100 {
    public static void main(String[] args) {
        int[] number = new int[100];
        int num = 1;

        for (int i = 0; i < 100 ; i++){
            number[i] = num;
            num++;
        }
        for( int array : number ){
            System.out.println(array);
        }
    }
}
