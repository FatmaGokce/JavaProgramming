package day_47_constructure;

public class StudentObjects {
    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student("Fatma");
        Student st4 = new Student(40);
        Student st5 = new Student("Fatma", 40);
    }
}
