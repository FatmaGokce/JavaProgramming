package day_48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        //static method can be called using Classname.staticMethodName
        Calculator.add(5, 3);

        //non static method can not called directly with Classname
        //like Calculator.multiply(5,3)
        //we need to create object, multiply method is instance method
        Calculator calculator = new Calculator();
        calculator.multiply(5, 3);

        //static method can also be called using an object
        calculator.add(10, 45);

    }
}
