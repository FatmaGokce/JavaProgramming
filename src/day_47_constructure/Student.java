package day_47_constructure;

public class Student {

    public Student() {
        System.out.println("no-args constructor");
    }

    public Student(String name) {
        System.out.println("name param constructor | name = " + name);
    }

    public Student(int age){
        System.out.println("aga param constructor | age = " + age);
    }

    public Student(String name, int age) {
        System.out.println("name and age param constructor | name and age = " + name + "-" +age);
    }

}
