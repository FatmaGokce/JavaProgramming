package day_18_condotions_practice_strings_intro;

public class carLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "E";
        double leasePrice = 0.0;

//        if (make.equals("Mercedes") && model.equals("E")) {
//                leasePrice = 500;
//        }else if (make.equals("Mercedes") && model.equals("A")){
//                leasePrice = 400;
//        }

        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500;
            }else if (model.equals("A")) {
                leasePrice = 400;
            }
        }else {
            System.out.println("Invalid make");
            return; //exit program/ exit main method
        }

        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);
    }
}
