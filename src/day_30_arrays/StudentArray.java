package day_30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        //first way
        String[] student2 ={"MK4501","Fatma", "Gokce", "B22", "226-154-2365"};
        //2. way if you don't know value yet.
        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-543-1234";

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstName = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2]);
        System.out.println("student1 BatchNum = " + student1[3]);
        System.out.println("student1 phoneNum = " + student1[4]);

        System.out.println("Student data length = " + student1.length);

        //check if student1 data array contains 5 items
        //true: PASS: data array has correct length
        //false: FAIL: data array has incorrect length.

        if (student1.length == 5){
            System.out.println("PASS: data array has correct length");
        }else
            System.out.println("FAIL: data array has incorrect length");

        /**
         check if student1 and student2 arrays have same number of data
         TRUE: PASS: data arrays length match
         FALSE: FAIL: data arrays length mismatch
         */
        if (student1.length==student2.length){
            System.out.println("PASS: data arrays length match");
        }else{
            System.out.println("FAIL: data arrays length mismatch");
        }
        /**
         print firstname and lastname in all uppercase
         ADAM SMITH
         */
        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        String mobileNum = student1[4];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("202"));
    }
}
