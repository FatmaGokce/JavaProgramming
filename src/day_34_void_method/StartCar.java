package day_34_void_method;

public class StartCar {
    public static void main(String[] args) {

        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();

    }
    public static void seatInCar(){
        System.out.println("1. Open the door and seat in driver seat");
    }
    public static void startTheCar(){
        System.out.println("2.Insert key to ignition and turn clockwise");
    }
    public static void shiftToDrive(){
        System.out.println("3.");
    }
    public static void pressGasPedal(){
        System.out.println("Pressing gas pedal");
    }
}
