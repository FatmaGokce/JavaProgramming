package day_19_class_vs_object_string;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName = "CYBERTEK";
        String password = "Abc123";

        if (expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("Pass - user successfully logged in");
        }else if (!expUserName.equals(userName)) {
            System.out.println("Incorrect Username");
        }else {
            System.out.println("Fail - password is incorrect");
        }
    }
}
