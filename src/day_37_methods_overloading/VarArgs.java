package day_37_methods_overloading;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(1,25,326);
        addNumbers(100,200,300);
        addNumbers();
        addNumbers(25,21,45,13,63,20,52,75,45,69,36,25,10,11,55,66,32,21,15);

    }
    //varargs
    public static void addNumbers(int... nums){
        //inside the method, it it used as regular array
        int sum = 0;
        for (int n : nums){
            sum += n;
        }
        System.out.println("Sum : " + sum);
    }
}
