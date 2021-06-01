package day_44_custom_classes;

public class Animal {
    String type = "Lion";

    public void eat(){
        System.out.println(type + " is eating");
    }
    public void eat(String food) {
        System.out.println("eating " + food);
    }
    public void speak(){
        System.out.println(type + " can not speak");
    }
}
