package day_38_method;

public class MethodCallAnother {
    public static void main(String[] args) {
        start();
        continues();
        end();
    }

    public static void start(){
        System.out.println("start");
        continues();
    }
    public static void continues(){
        System.out.println("continues");
        end();
    }
    public static void end(){
        System.out.println("end");
    }
}
