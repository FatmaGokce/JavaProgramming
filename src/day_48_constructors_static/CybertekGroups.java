package day_48_constructors_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 = new Group("Cyberbugs");//dependency injection
        //print size of member
        System.out.println(group1.getMembers().size());
        group1.addMembers("Fatma");
        group1.addMembers("Neslihan");
        group1.addMembers("Asuman");
        group1.addMembers("Muruvvet");
        group1.addMembers("Yildiz");
        System.out.println("Size = " + group1.getMembers().size());
        System.out.println(group1);

        //second way to add members
        /** group1.setMembers(Arrays.asList("Max","Mykola",
                "Nasiba","Ilyas","Zafar","Meleha","Kamala","Rita","Kanymgul"));
         **/

        Group group2 = new Group("Ubuntu");
        group2.setMembers(Arrays.asList("Fatma", "Asuman", "Muruvvet", "Yildiz", "Neslihan"));
        System.out.println(group2.getMembers());
        System.out.println(group2);
        if (group2.getMembers().contains("Fatma")) {
            System.out.println("Fatma is here.");
        }else {
            System.out.println("Fatma is not here");
        }

        group1.removeMembers("Fatma");
        group1.removeMembers("Asuman");
        System.out.println(group1);// it goes directly toString method.
    }
}
