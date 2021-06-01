package day_47_constructure;

import com.sun.xml.internal.ws.resources.AddressingMessages;

public class AddressList {
    public static void main(String[] args) {

        Address cybertekAddress = new Address();
        //when you write NEW it's automatically call the Address Method(Constructor method)
        cybertekAddress.setStreet("7925 Jhones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("cybertekAddress = " + cybertekAddress);

        cybertekAddress.setStreet("7925 Jhones Branch Dr Suite 3200");
        System.out.println("after address change = " + cybertekAddress);
        System.out.println("Street info = " + cybertekAddress.getStreet());

        Address newAddress = new Address();
        newAddress.setStreet("7921 jones branch dr Suite 200");
        newAddress.setCity("McLean");
        newAddress.setState("VA");
        newAddress.setZipCode("22102");
        System.out.println(newAddress.toString());

        Address papaJohnPizza = new Address("8501 Tyco Rd Ste 1A", "Vienna", "VA", "22182");
        System.out.println("Papa John pizza = " + papaJohnPizza.toString());


    }
}
