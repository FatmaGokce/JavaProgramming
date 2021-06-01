package day_29_nestedloop_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for(int outer = 1; outer <= 5; outer++){
            for(int inner = 1; inner <= 10; inner++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int outer = 1; outer <= 10; outer++){//says how many rows will be
            for(int inner = 1; inner <= outer; inner++){//it writes column
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(int outer = 1; outer <= 10; outer++){//says how many rows will be
            for(int inner = 10; inner >= outer; inner--){//it writes column
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
