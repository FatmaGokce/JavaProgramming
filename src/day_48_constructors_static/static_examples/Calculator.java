package day_48_constructors_static.static_examples;

public class Calculator {
    //static method
    public static void add(int a, int b) {
        System.out.println("a+b = " + (a+b));
    }

    //instance method or object method
    public void multiply(int a, int b ) {
        System.out.println(a*b);
    }
}
