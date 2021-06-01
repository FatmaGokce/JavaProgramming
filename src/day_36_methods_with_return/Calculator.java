package day_36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Sum = " + add(12.5,25.8));
        System.out.println("minus(25.8, 12.4) = " + minus(25.8, 12.4));
        System.out.println("multiply(42.1,2.3) = " + multiply(42.1, 2.3));
        System.out.println("divide(125.4,3.0) = " + divide(125.4, 3.0));
    }
    public static double add(double num1, double num2){
        double sum = num1 + num2;
        return sum;
    }
    public static double minus(double num1, double num2) {
        double minus = num1 - num2;
        return minus;
    }
    public static double multiply(double num1, double num2) {
        double multiply = num1 * num2;
        return multiply;
    }
    public static double divide(double num1, double num2) {
        double divide = num1 / num2;
        return divide;
    }
}
