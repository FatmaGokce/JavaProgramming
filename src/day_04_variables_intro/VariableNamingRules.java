package day_04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args) {
        //int static = 22; error, static is reserved by java
        int static2 = 22;
        int _static = 22;
        int $static = 22;
        int staticVar = 22;

        int salary$ = 234;
        //int 1stMonthSalary = 3000; error, cannot start with number

        int $ = 10;
        int _ = 3;
        System.out.println($);
        System.out.println(_);
        //Above variables work fine, but not recommended
        //we should use meaningful variable names
        //int number-of-friends = 400; error
        int numberOfFriends = 401;
        int number_of_students = 401;//not convention

    }
}
