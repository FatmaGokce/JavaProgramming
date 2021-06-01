package day_15_logical_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 10;

        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat. Age = " + age);
        } else {
            System.out.println("Don't need to sit car seat. Age = " + age);
        }

        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit");
        }

        boolean isAffordable = true;
        if (!isAffordable) {
            System.out.println(" Item is not affordable..");
        }

        String env = "qa";
        if (!env.equals("qa")) {
            System.out.println(" In wrong environment for QA testing.");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        //if inputPassword IS NOT equals secretPassword: print "Incorrect Password"
        if (!inputPassword.equals("abc123")) {
            System.out.println("Incorrect password");
        }

        if (!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect password");
        }

        if (inputPassword.equals("abc321")) {
            System.out.println("Correct password");
        } else {
            System.out.println("In correct password");
        }

    }
}
