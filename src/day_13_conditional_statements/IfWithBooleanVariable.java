package day_13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;

        if (isHungry) {// if it's true execute if condition
            System.out.println("I am hungry I will go get something to eat");
            System.out.println("Then code Java");
        }
        else {// when it's false execute else condition
            System.out.println("I am not hungry, Lets keep coding java.");
        }
        double price = 134.44;
        boolean isAffordable = 200 >= price;

        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) {
            System.out.println("Yes it is affordable");
        }
        else {
            System.out.println("Sorry, it is not affordable");
        }

        boolean isRemoteJob = true;
        //if(isRemoteJob != true)
        if(!isRemoteJob) {
            System.out.println("Sorry I am not interested");
        }
        else {
            System.out.println("Sure I am interested, what is the interview process?");
        }
    }
}
