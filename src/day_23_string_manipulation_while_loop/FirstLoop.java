package day_23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {

        int i =1;
        if(i <=5){
            System.out.println(i);
        }

        while(i<=5){
            System.out.println(i);
            i++;
        }

        int apples = 0;
        while (apples <= 3){
            System.out.println("apples = " + apples++);
        }
        System.out.println("apples =" + apples);
    }
}
