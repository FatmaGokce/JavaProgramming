package day_48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1);//print with default values that are set in no-args constructor
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2);
        Customer cs3 = new Customer("John Ward III", 3954);
        System.out.println(cs2);
        System.out.println(cs3);

        //array customers
        Customer[] todayCustomers = {cs1, cs2, cs3,new Customer("Fatma", 449)};

        //arrayList of Customer objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Fatma", 449));
        customerList.add(new Customer("Omar", 9763));

        //Print info of first customer object in array and arrayList.
        System.out.println(todayCustomers[0].toString());
        System.out.println(customerList.get(0).toString());

        System.out.println(customerList);
        //print with for loop
        System.out.println("----------for loop-----------");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }

        //foreach loop
        System.out.println("----------foreach----------");
        for (Customer eachCustomer : customerList) {
            System.out.println(eachCustomer);
        }

        //print olnly names of Customers in the list
        System.out.println("------Names of Customer--------");
        customerList.forEach(each -> System.out.println(each.getName()));//lambda

    }

}
