package day_43_list_custom_classes;

public class Company {
    public static void main(String[] args) {

        Employee person1 = new Employee();
        Employee person2 = new Employee();
        Employee person3 = new Employee();

        person1.name = "Fatma";
        person1.jobTitle = "SDET";
        person1.work();

        person2.name = "Sam";
        person2.jobTitle = "Developer";
        person2.work();

        person3.name = "Tom";
        person3.jobTitle = "PO";
        person3.work();

    }
}
