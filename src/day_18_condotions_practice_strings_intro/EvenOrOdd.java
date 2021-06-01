package day_18_condotions_practice_strings_intro;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num = 4;

        if(num % 2 ==0) {
            System.out.println(num + " is even.");
        }else {
            System.out.println(num + " is odd.");
        }

        System.out.println((num%2==0) ? "is even" : "is odd");//ternary condition
    }
}
