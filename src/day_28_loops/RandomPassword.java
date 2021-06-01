package day_28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        Random random = new Random();
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        String password = "";

        for(int i = 1; i <=8; i++){
            int index = random.nextInt(71);//random num 0 - 70
            System.out.print(source.charAt(index));//random password
            //System.out.println(random.nextInt(source.length()));
            password += source.charAt(index);
        }
        System.out.println("\nYour Password = " + password);
    }
}
